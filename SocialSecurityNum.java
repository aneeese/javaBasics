package Basic.Assignment_2;
/*
 * MUHAMMAD ANEES
 * FA20-BCS-045
 * BCS-2A
 * SUBMITTED TP SIR RIZWAN RASHID
 * Question
Write a program that prompts the user to enter a Social Security number in the format DDD-DD-DDDD,
where D is a digit. Your program should check whether the input is valid. Here are 
sample runs:
Enter a SSN: 232-23-5435
232-23-5435 is a valid social security number
Enter a SSN: 23-23-5435
23-23-5435 is an invalid social security number
 */
import java.util.*;
public class SocialSecurityNum {
	public static void main(String[] args) {
		//class to get input
		Scanner in = new Scanner(System.in);
		//prompting to get input
		System.out.print("Enter a Social Security Number(DDD-DD-DDDD): ");
		String SSN = in.nextLine(); //storing input from user
		//selection statement to check whether its valid SSN or not
		if ((SSN.charAt(3) == '-') && (SSN.charAt(6) == '-') && (SSN.length() == 11))
			System.out.print(SSN +" is a valid Social Security Number.");
		else
			System.out.print(SSN +" is an invalid Social Security Number.");
	}
}