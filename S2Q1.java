package Basic.SessionalsTerminal;
/*
 * MUHAMMAD ANEES
 * FA20-BCS-045
 * SUBMITTED TO SIR RIZWAN RASHID
 * QUESTION:
 * Write down a program in which �main� method gets its arguments as an English sentence
 * and shows its individual words on separate line along with their length.                         
 */
import java.util.Scanner;
public class S2Q1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string line: ");
		//storing input
		String S = in.nextLine();
		//using split to get the words from a line to array
		String [] words = S.split(" ");
		//using loop to print the length of words
		for(int i = 0; i < words.length; i++) {
		    System.out.print(words[i]);
		    System.out.print("----->"+words[i].length());
		    System.out.println();
		}
	}
}
