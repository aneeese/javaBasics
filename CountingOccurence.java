package Basic.Assignment_3;
/*
 * MUHAMMAD ANEES
 * FA20-BCS-045
 * BCS-2A
 * SUBMITTED TO SIR RIZWAN RASHID
 * Question:
 *  (Count occurrence of numbers) Write a program that reads the integers between 1 
and 100 and counts the occurrences of each. Assume the input ends with 0.
 */
import java.util.*;
public class CountingOccurence {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] number = new int[100];	//Array to store numbers
		System.out.println("Enter integrs between 1 and 100, Enter 0 to exit: ");
		//using loop to get input
		//it will run untill user enter zero
		for (int i = 0; i < number.length; i++) {
			int integer = in.nextInt();	//storing user entered input
			if (integer == 0)
				break;
			else
				number[i] = integer;	//input getting stored in array declared above
			
		}
		//outer loop 
		for (int i = 1 ; i < 100; i++) {
			int count = 0;
			//inner loop with which outer loop value is being compared to count the occurence
			for(int j = 0; j < number.length - 1; j++) {
				if (number[j] == i)
					count++;
			}
			//printing the occurence of each element
			if (count != 0)
				System.out.println(i + " exist " + count + " times");
		}
	}
}