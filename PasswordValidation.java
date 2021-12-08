package Basic.SessionalsTerminal;
/*
 * MUHAMMAD ANEES
 * FA20-BCS-045
 * SUBMITTED TO SIR RIZWAN RASHID
 * QUESTION
 * Some websites impose certain rules for passwords. Write a method that checks whether a 
 * string is a valid password. Suppose the password rules are as follows:
A password must have at least eight characters.
A password consists of only letters and digits.
A password must contain at least two digits.
Write a program that prompts the user to enter a password and displays
Valid Password if the rules are followed or Invalid Password otherwise.
 */
import java.util.*;
public class PasswordValidation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter password: ");
		String password = in.next();	//saving password
		System.out.print(ValidPasswordOrNot(password) ? "Valid password" : "Invalid password");
	}
	//method to check validation of a password
	public static boolean ValidPasswordOrNot(String S) {
	    final int noOfDigits = 2;	// Minimum digits it must contain
		boolean validorNot = passwordLength(S) && LetterOrDigit(S) &&
			hasTwoDigits(S, noOfDigits);
		return validorNot;
	}
	//method to check the length of a password
	public static boolean passwordLength(String S) {
		if (S.length() >= 8)
			return true;
		return false;			
	}
	//method to check if password contains only letters and digits
	public static boolean LetterOrDigit(String S) {
		for (int i = 0; i < S.length(); i++) {
			if (!Character.isLetterOrDigit(S.charAt(i))) 
				return false;
			return true;
		}
		return true;
	}
	//method to check if password contain at least two digits
	public static boolean hasTwoDigits(String S, int n) {
		int totalDigits = 0;
		for (int i = 0; i < S.length(); i++) {
			if (Character.isDigit(S.charAt(i))) {
				totalDigits++;
			}
			if (totalDigits >= n) {
				return true;
			}
		}
		return false;
	}
}
