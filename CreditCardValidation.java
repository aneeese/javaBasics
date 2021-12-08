package Basic.Assignment_3;
/*
 * MUHAMMAD ANEES
 * FA20-BCS-045
 * BCS-2A
 * SUBMITTED TO SIR RIZWAN RASHID
 * Question:
 * Write a program that prompts the user to enter a credit card number as a long
integer. Display whether the number is valid or invalid.You may also implement this program by 
reading the input as a string and processing the string to validate the credit card.
 */
import java.util.Scanner;
public class CreditCardValidation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Credit Card Number: ");
		String CC = in.nextLine();	//storing user entered input
		//printing if entered Credit Card is valid or not
		System.out.print(CC);
		System.out.print(isValid(CC)? " is valid." : " is invalid.");
	}
	//method to check conditions that will determine weather CC is valid or not
	public static boolean isValid(String number) {
		boolean valid = false;
		//summing the sum of even and odd places in CC
		int sum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
		//condition of validation
		if ((sum % 10 == 0) && (prefixMatched(number) == true) && (getSize(number)) == true) 
			valid = true;
		else
			valid = false;
		return valid;
			
	}
	//method to get sum of even places
	public static int sumOfDoubleEvenPlace(String number) {
		int sum = 0;
		//loop is getting sum of even places
		 for (int i = number.length() - 2; i >= 0; i -= 2) {
		      int digit = Character.digit(number.charAt(i),10);
		      //getDigit method is invoked to break two digit number to single
		      sum += getDigit(digit * 2);
		    }
		return sum;
	}
	//method for getting single digit number
	public static int getDigit(int number) {
		int digit = (number / 10) + (number % 10);
		return digit;
	}
	//method to get sum of odd places in CC
	public static int sumOfOddPlace(String number) {
		int sum = 0;
	    for (int i = number.length() - 1; i >= 0; i -= 2) {
	      int digit = Character.digit(number.charAt(i), 10);
	      sum += digit;
	    }
	    return sum;
	}
	//method to check if the prefix of CC match the prefix of CC worldwide
	public static boolean prefixMatched(String number) {
		    if (number.startsWith("4") || number.startsWith("5") ||
		        number.startsWith("37") || number.startsWith("6")) {
		    	return true;
		    }
		    return false;
	}
	//method to check the length of CC
	public static boolean getSize(String number) {
		int length = number.length();
		if (length >= 13 && length <= 16)
			return true;
		return false;
	  }
}
