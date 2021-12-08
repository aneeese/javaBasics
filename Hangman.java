package Basic.Assignment_3;
/*
 * MUHAMMAD ANEES
 * FA20-BCS-045
 * BCS-2A
 * SUBMITTED TO SIR RIZWAN RASHID
 * Question:
 (Game: hangman) Write a hangman game that randomly generates a word and 
prompts the user to guess one letter at a time, as shown in the sample run. Each 
letter in the word is displayed as an asterisk. When the user makes a correct 
guess, the actual letter is then displayed. When the user finishes a word, display the number of misses and ask the user whether to continue to play with another 
word. Declare an array to store words
 */
import java.util.*;
public class Hangman {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String string;
        //do while loop to get random word and placing asterisks at length of word
        do {
            char[] word = getWord();
            char[] asterisks = new char[word.length];
            fillAsterisks(asterisks);
            int missed = 0;
            //do while loop getting guess from user
            do {
                char guess = getGuess(asterisks);
                //if guess is incorrect, this condition executes
                if (!isCorrectGuess(word, asterisks, guess))
                    missed++;
            } while (!isWordFinish(asterisks));
            //printing actual word and number of times guess was incorrect
            print(word, missed);
            //asking to play again or not
            System.out.println("Do you want to guess another word?"
            		+ " Enter y or n: ");
            string = in.next();
            //condition for another guess if user wants
        } while (string.charAt(0) == 'y');
    }
	//method to get random word
    public static char[] getWord() {
        String[] words = {"programming","laptop","village","city","eating","river",
        		"School","college","university","parliment","books"};
        String pick = words[(int)(Math.random() * words.length)];
        char[] word = new char[pick.length()];
        for (int i = 0; i < word.length; i++) {
            word[i] = pick.charAt(i);
        }
        return word;
    }
    //method to fill asterisks 
    public static void fillAsterisks(char[] list) {
        for (int i = 0; i < list.length; i++) {
            list[i] = '*';
        }
    }
    //if guess is correct, this method executes to place guessed word at actual index
    public static boolean isCorrectGuess(char[] word, char[] blanks, char guess) {
        boolean correct = false;
        int num = 2;
        for (int i = 0; i < word.length; i++) {
            if (word[i] == guess) {
                correct = true;
                if (blanks[i] == guess)
                    num = 1;
                else {
                    blanks[i] = guess;
                    num = 0;
                }
            }
        }
        if (num > 0)
            print(num, guess);
        return correct;
    }
    //to check if the word is complete or not
    public static boolean isWordFinish(char[] blanks) {
        for (char e: blanks) {
            if (e == '*')
                return false;
        }
        return true;
    }
    //method to check number of times user missed or his guess was incorrect
    public static void print(char[] word, int missed) {
        System.out.print("The word is ");
        System.out.print(word);
        System.out.println(" You missed " + missed + " time");
    }
    //printing when entered character is already done in word
    // i.e. user guessed it before
    public static void print(int m, char guess) {
        System.out.print("\t" + guess);
        switch (m) {
            case 1 : System.out.println(" is already in the word"); break;
            case 2 : System.out.println(" is not in the word");
        }
    }
    //method to get guess from the user
    public static char getGuess(char[] asterisks){
        Scanner input = new Scanner(System.in);
        System.out.print("(Guess) Enter a letter in word ");
        System.out.print(asterisks);
        System.out.print(" > ");
        String g = input.next();
        return g.charAt(0);
	}	
}
