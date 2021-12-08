package Basic.SessionalsTerminal;
/*
MUHAMMAD ANEES 
FA20-BCS-045
BCS-2A
SUBMITTED TO SIR RIZWAN RASHID
*/
import java.util.*;
public class Q01 {
   public static void main(String[] args) {
        System.out.println("Enter your 1st name and Reg#: ");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        input.close();
        String reversed = reverseString(userInput);
        System.out.println("The reversed string is " + reversed);
    }
    //method to reverse user input
    public static String reverseString(String str){
        if (str.isEmpty())
            return str;
        return reverseString(str.substring(1)) + str.charAt(0);
    }
} 

