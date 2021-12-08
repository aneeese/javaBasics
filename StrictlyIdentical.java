package Basic.Assignment_3;
/*
 * MUHAMMAD ANEES
 * FA20-BCS-045
 * BCS-2A
 * SUBMITTED TO SIR RIZWAN RASHID
 * Question:
 (Strictly identical arrays) The arrays list1 and list2 are strictly identical
if their corresponding elements are equal. Write a method that returns true if 
list1 and list2 are strictly identical, using the following header:

public static boolean equals(int[] list1, int[] list2)

Write a test program that prompts the user to enter two lists of integers and
 displays whether the two are strictly identical.
 */
import java.util.Scanner;
public class StrictlyIdentical {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of elements \n"
				+ "you want to enter in lists: ");
		int num = in.nextInt();
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
		//invoking method to get output if they are equal
		System.out.print("The lists " + (equals(list1,list2) ? "are strictly " : "are not strictly ") + "equal");
	}
	//method to check if both lists are strictly equal
	public static boolean equals(int[] list1, int[] list2) {
		for (int k = 1; k < list1.length; k++) {
			//comparing indexes to see if they are equal
			if (list1[k] != list2[k])
				return false;
		}
		return true;
	}
}
