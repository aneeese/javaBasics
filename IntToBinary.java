package Basic.Assignment_2;
/*
 * MUHAMMAD ANEES
	FA20-BCS-045
	BCS-2A
	SUBMITTED TO SIR RIZWAN RASHID
Question:
Write a program that prompts the user to enter a decimal integer and displays its corresponding 
binary value. Don�t use Java�s Integer.toBinaryString(int) in this program.
 */
import java.util.*;
public class IntToBinary {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); //class to get input
		
		//Asking user to enter his/her choice
		System.out.print("Enter 1 for fractional decimal to binary or\n"
				+ "Enter 2 for simple decimal to binary: ");
		
		int choice = in.nextInt(); //storing choice
		//for choice 1
		if (choice == 1) {
			System.out.print("Enter a decimal integer: ");
			float num = in.nextFloat(); //storing user input
			
			//integer without fractional part is separated
			int integer = (int)(num); 
			
			//separating fractional part
			float decimal = num - integer;
			
			String binary = ""; //variable in which binary value will store
			
			while (true) {
				
				//Getting mod of integer and adding with previous value.
				binary = integer % 2 + binary;
				
				//closing loop condition
				if (integer == 1)
					break;
				
				//dividing integer by 2 to get next value
				integer = integer / 2;
				
			}
			//showing output
			System.out.print("Binary equivalent of "+num+" is "+binary);
			
			//printing fraction point
			System.out.print(".");
			
			while (true) {
				
				//multiplying decimal fraction with 2 to get binary value
				decimal = decimal * 2;
				
				//loop ending condition
				if (decimal == 1)
					break;
				
				//condition to separate binary value
				else if (decimal > 1) {
					
					System.out.print(1);
					//subtracting if value is grater than 1 to use in next itteration
					decimal = decimal - 1;
				}
				else
					System.out.print(0);
			}
		}
		//for 2nd choice i.e. simple decimal to binary
		else {
			System.out.print("Enter a decimal number: ");
			int num = in.nextInt(); //storing input
			
			String binary = "";  //variable to store binary value
			
			while (true) {
				//Getting mod of integer and adding with previous value.
				binary = num % 2 + binary;
				//loop ending condition
				if (num == 1)
					break;
				//dividing by 2 to get next value
				num = num / 2;
			}
			//showing output
			System.out.print("Binary equivalent is "+binary);
		}
	}
}