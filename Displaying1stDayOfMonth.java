package Basic.Assignment_2;
/*
 * Muhammad Anees
 * FA20-BCS-045
 * BCS 2A
 * Submitted to Sir Rizwan Rashid
Write a program that prompts the user to enter the year and first day of the year, and displays the first 
day of each month in the year. For example, if the user entered the year 2013, and 2 for Tuesday, 
January 1, 2013, your program should display the following output:
January 1, 2013 is Tuesday
...
December 1, 2013 is Sunday
 */
import java.util.*;
public class Displaying1stDayOfMonth {
	public static void main(String[] args){
		//Class to get input from user
		Scanner in = new Scanner(System.in); 
		
		//prompt to ask user to enter year
		System.out.print("Enter the year: ");    
		int year = in.nextInt();//storing input
		
		//prompt to get 1st day of year
		System.out.println("Enter day of week(i.e. 0 for Sunday and so on): "); 
		int day = in.nextInt();      //storing 1st day of 1st month

		//Number of days in a particular month are stored in variables
		int january = 31, feburary = 28, feb1 = 29, march = 31, april = 30,
		may = 31, june = 30, july = 31, august = 31, sept = 30,
		october = 31, november = 30, december = 31;
		
		//loop for 12 months of year
		for (int count = 1; count <= 12; count++) {
			String dayOfWeek = " "; //Variable to store day of the week
			//Switch statements to get the week day
			switch (day) {
			case 0 : dayOfWeek = "Sunday";break;
			case 1 : dayOfWeek = "Monday"; break;
			case 2 : dayOfWeek = "Tuesday"; break;
			case 3 : dayOfWeek = "Wednesday"; break;
			case 4 : dayOfWeek = "Thursday"; break;
			case 5 : dayOfWeek = "Friday"; break;
			case 6 : dayOfWeek = "Saturday"; break;
			}
			
			//Selection statements to get the 1st day of each month
			if (count == 1) {
				//adding total days in a month and user input and taking mod with 7
				day = (january + day) % 7;
				//displaying result
				System.out.println("January 1,"+year+" is "+dayOfWeek);
			}
			//for feburary
			else if (count == 2) {
				//selection statement if user enters a leap year
				if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
					day = (feb1 + day) % 7;
					System.out.println("Feburary 1,"+year+" is "+dayOfWeek);
				}
				else {
					day = (feburary + day) % 7;
					System.out.println("Feburary 1,"+year+" is "+dayOfWeek);
				}
			}
			//for march
			else if (count == 3) {
				day = (march + day) % 7;
				System.out.println("March 1,"+year+" is "+dayOfWeek);
			}
			//for april
			else if (count == 4) {
				day = (april + day) % 7;
				System.out.println("April 1,"+year+" is "+dayOfWeek);
			}
			//for may
			else if (count == 5) {
				day = (may + day) % 7;
				System.out.println("May 1,"+year+" is "+dayOfWeek);
			}
			//for june
			else if (count == 6) {
				day = (june + day) % 7;
				System.out.println("June 1,"+year+" is "+dayOfWeek);
			}
			//for july
			else if (count == 7) {
				day = (july + day) % 7;
				System.out.println("July 1,"+year+" is "+dayOfWeek);
			}
			//for august
			else if (count == 8) {
				day = (august + day) % 7;
				System.out.println("August 1,"+year+" is "+dayOfWeek);
			}
			//for september
			else if (count == 9) {
				day = (sept + day) % 7;
				System.out.println("September 1,"+year+" is "+dayOfWeek);
			}
			//for october
			else if (count == 10) {
				day = (october + day) % 7;
				System.out.println("October 1,"+year+" is "+dayOfWeek);
			}
			//for november
			else if (count == 11) {
				day = (november + day) % 7;
				System.out.println("November 1,"+year+" is "+dayOfWeek);
			}
			//for december
			else if (count == 12) {
				day = (december + day) % 7;
				System.out.println("December 1,"+year+" is "+dayOfWeek);
			}
		}
	}
}
