package Basic.Assignment_2;
/*
 * MUHAMMAD ANEES
	FA20-BCS-045
	BCS-2A
	SUBMITTED TO SIR RIZWAN RASHID
 * Write a program that prompts the user to enter two strings and reports whether the second string 
is a substring of the first string.
 */
import java.util.*;
public class SubString {
	public static void main(String[] args) {
		//class to get input
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string: "); //prompt 
		String s1 = in.nextLine();			  //variable to store input
		System.out.print("Enter another string: ");
		String s2 = in.nextLine();			  //storing input
		//using contain to check if substring is present or not
		if (s1.contains(s2)) 
			System.out.print(s2+" is"+" substring of "+s1);
		else
			System.out.print(s2+" is not a"+" substring of "+s1);
	}

}
