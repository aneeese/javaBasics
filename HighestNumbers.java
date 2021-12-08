package Basic.SessionalsTerminal;
/*
 * MUHAMMAD ANEES
 * FA20-BCS-045
 * SUBMITTED TO SIR RIZWAN RASHID
 * QUESTION:
 * A sequence consists of integer numbers and ends with the number 0. 
 * Determine three highest numbers in the sequence. Do Not Use Arrays.
 */
import java.util.*;
public class HighestNumbers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter integer sequence(enter 0 to exit): ");
		int highest = 0;	//storing highest number
		int secondHighest = 0; //storing 2nd highest
		int thirdHighest = 0;	//storing 3rd highest
		//loop to get input as well as to check the highest number
		while (true) {
			int num = in.nextInt();
			//condition to end getting input
			if (num == 0)
				break;
			//condition to check highest number
			else if (num > highest) {
				thirdHighest = secondHighest;
				secondHighest = highest;
				highest = num;
				}
			//condition for 2nd highest number
			else if ((num > secondHighest) && (num < highest)) {
				thirdHighest = secondHighest;
				secondHighest = num;
				}
			//condition for 3rd highest number
			else if ((num > thirdHighest) && (num < secondHighest) && (num < highest)) {
				thirdHighest = num;
				}
			}
		//printing output
		System.out.print("Three highest numbers are "+ highest+">"
				+secondHighest+">"+thirdHighest);
	}
}
