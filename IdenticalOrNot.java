package Basic.Assignment_3;
/*
 * MUHAMMAD ANEES
 * FA20-BCS-045
 * BCS-2A
 * SUBMITTED TO SIR RIZWAN RASHID
 * Question:
 (Identical arrays) The arrays list1 and list2 are identical if they have the 
same contents. Write a method that returns true if list1 and list2 are identical, 
using the following header:

public static boolean equals(int[] list1, int[] list2)

Write a test program that prompts the user to enter two lists of integers and
 displays whether the two are identical
 */
import java.util.*;
public class IdenticalOrNot {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of elements \n"
				+ "you want to enter in lists: ");
		int num = in.nextInt();	//storing input
		int[] list1 = new int[num];	//list1 array
		int[] list2 = new int[num];	//list2 array
		//getting input and storing in list1
		System.out.println("Enter list 1: ");
		for (int i = 0; i < list1.length; i++) {
			list1[i] = in.nextInt();
		}
		//getting input and storing in list2
		System.out.println("Enter list 2: ");
		for (int i = 0; i < list2.length; i++) {
			list2[i] = in.nextInt();
		}
		//invoking method to see if they are equal
		System.out.print("The lists " + (equals(list1,list2) ? "are " : "are not ") + "equal");
	}
	//method to check if both lists are equal
	public static boolean equals(int[] list1, int[] list2) {
		//invoking sort method to sort the lists in ascending order
		sort(list1);
		sort(list2);
		//loop
		for (int k = 1; k < list1.length; k++) {
			//conmparing indexes
			if (list1[k] != list2[k])
				return false;
		}
		return true;
	}
	//method to sort the lists in ascending order
	public static void sort(int[] list) {
		//outer loop
		for (int i = 0; i < list.length - 1; i++) {
			int min = list[i];
			int minIndex = i;
			//inner loop to check if outer loop value is
			//less or greater than inner loop value
			for (int j = i + 1; j < list.length; j++) {
				//if inner loop value is less than minimum, 
				//new min value is assigned to min variable
				if (list[j] < min) {
					min = list[j];
					minIndex = j;
				}
			}
			//assigning minimum value to min
			if (minIndex != i) {
				list[minIndex] = list[i];
				list[i] = min; 
			}
		}
	}
}
