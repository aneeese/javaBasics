package Basic.Assignment_1;
/*Write a program that prompts the user to enter the month and year
  and displays the number of days in the month. For example, 
  if the user entered month 2 and year 2012, the program should display that 
  February 2012 had 29 days.
 */
import java.util.*;
public class DaysandYear {
	public static void main(String[] args) {
		//scanner class to get input
	Scanner in = new Scanner(System.in);
	System.out.print("Enter the Month: ");
	int month = in.nextInt();
	System.out.print("Enter the year: ");
	long year = in.nextLong();
	//selection statements to display which month has how many days
	if (month == 2 && year % 4 == 0) 
		System.out.println("Feburary "+ year +" had 29 days");
	else if (month == 1)
		System.out.println("January "+ year +" had 31 days");
	else if (month == 2)
		System.out.println("Feburary "+ year +" had 28 days");
	else if (month == 3)
		System.out.println("March "+ year +" had 31 days");
	else if (month == 4)
		System.out.println("April "+ year +" had 30 days");
	else if (month == 5)
		System.out.println("May "+ year +" had 31 days");
	else if (month == 6)
		System.out.println("June "+ year +" had 30 days");
	else if (month == 7)
		System.out.println("July "+ year +" had 31 days");
	else if (month == 8)
		System.out.println("August "+ year +" had 31 days");
	else if (month == 9)
		System.out.println("September "+ year +" had 30 days");
	else if (month == 10)
		System.out.println("October "+ year +" had 31 days");
	else if (month == 11)
		System.out.println("November "+ year +" had 30 days");
	else if (month == 12)
		System.out.println("December "+ year +" had 31 days");
	else
		System.out.println("Invalid number");
	}

}
