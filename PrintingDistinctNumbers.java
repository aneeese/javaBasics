package Basic.Assignment_3;
/*
 * MUHAMMAD ANEES
 * FA20-BCS-045
 * BCS-2A
 * SUBMITTED TO SIR RIZWAN RASHID
 * Question:
 *  (Print distinct numbers) Write a program that reads in ten numbers and displays 
the number of distinct numbers and the distinct numbers separated by exactly one 
space.
 */
import java.util.*;
public class PrintingDistinctNumbers {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int[] distinctNumbers = new int[10]; // Array of length 10
		int num; 				// User input
		int count = 0;			// Number of distinct numbers

		// Prompt the user to enter ten numbers
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < 10; i++) {
			num = input.nextInt();
			//checking if num is distinct
			if (isDistinct(distinctNumbers, num)) {
				distinctNumbers[count] = num;
				count++;	// Incrementing count
			}
		}
		// Displays the number of distinct numbers and the  
		// distinct numbers separated by exactly one space
		System.out.println("The number of distinct numbers is " + count);
		System.out.print("The distinct numbers are");
		for (int i = 0; i < distinctNumbers.length; i++) {
			if (distinctNumbers[i] > 0)
				System.out.print(" " + distinctNumbers[i]);
		}
		System.out.println();
	}
	// this method returns true if number is not in array false otherwise
	public static boolean isDistinct(int[] array, int num) {
		for (int i = 0; i < array.length; i++) {
			if (num == array[i]) 
				return false;
		}
		return true;
	}
}

