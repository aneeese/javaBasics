/*
MUHAMMAD ANEES
FA20-BCS-045
SUBMITTED TO SIR RIZWAN RASHID
CLASS ASSIGNMENT QUESTION 2
*/
package Basic.Assignment_4;
import java.util.*;
import java.io.*;
public class babyNameRanking {
    public static void main(String[] args) throws IOException{
        //getting input of year, name and Gender
        Scanner Keyboardinput = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = Keyboardinput.nextInt();
        System.out.print("Enter the gender(M/F): ");
        String gender = Keyboardinput.next();
        System.out.print("Enter the name: ");
        String name = Keyboardinput.next();
        Keyboardinput.close();
        //file
        File file = new File("babynameranking"+year+".txt"); //file
        //variable to print ranking of name
        int count = 0;
        try {
            //scanner to read file
            Scanner input = new Scanner(file);
            while (input.hasNext()) {
                count++;
                //storing file in variable to search the requires name
                final String  lineFromFile = input.nextLine();
                //if found
                if (lineFromFile.contains(name)) {
                    // a match!
                    System.out.println(name + " is ranked #" + count + " in year " + year);
                    break;
                }
            }
            input.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
