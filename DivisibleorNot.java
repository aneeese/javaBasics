package Basic.Assignment_1;
/*Write a program that prompts the user to enter an integer and determines
 whether it is divisible by 5 and 6, whether it is divisible by 5 or 6,
 and whether it is divisible by 5 or 6, but not both.
 */
import java.util.*;
public class DivisibleorNot {
	public static void main(String[] args) {
		//class to get input
		Scanner in = new Scanner(System.in);
		//prompt for getting input
		System.out.print("Enter an Integer: ");
		int num = in.nextInt();
		//statements to check whether number is divisible or not
		boolean answer = (num % 5 == 0 && num % 6 == 0)?  true : false;
			System.out.println("Is "+ num + " divisible by 5 and 6? "+ answer);
		boolean answr = (num % 5 == 0 || num % 6 == 0)?  true : false;
			System.out.println("Is "+ num + " divisible by 5 or 6? "+ answr);
		boolean ans = (num % 5 == 0 ^ num % 6 == 0)?  true : false;
			System.out.println("Is "+ num + " divisible by 5 and 6, but not both? "+ ans);
	}
	

}
