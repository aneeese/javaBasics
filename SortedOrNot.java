package Basic.Assignment_3;
/*
 * MUHAMMAD ANEES
 * FA20-BCS-045
 * BCS-2A
 * SUBMITTED TO SIR RIZWAN RASHID
 * Question:
 (Sorted?) Write the following method that returns true if the list is already sorted 
in increasing order.

public static boolean isSorted(int[] list)

Write a test program that prompts the user to enter a list and displays whether 
the list is sorted or not. 
 */
import java.util.*;
public class SortedOrNot {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//prompting to get limit
		System.out.print("Enter number of integers you want to enter: ");
		int num = in.nextInt();	//storing input
		int[] list = new int[num];	//array 
		//loop to store input in array
		System.out.println("Enter a list: ");
		for (int i = 0; i < list.length; i++) {
			list[i] = in.nextInt();
		}
		//for each loop to print elements of list
		for (int i : list)
			System.out.print(i + " ");
		System.out.println();
		//invoking method to show if list is sorted or not
		System.out.print("The list is " + (isSorted(list) ? "already " : "not ") + "sorted");
	}
	//method for checking list if it is sorted or not
		public static boolean isSorted(int[] list) {
			for (int i = 0; i < list.length - 1; i++) {
				//comparing indexes
				if (list[i] > list[i + 1]) {
					return false;
				}
		}
			return true;
	}
}
