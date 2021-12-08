package Basic.Assignment_1;
/* Write a program that prompts the user to enter
an integer for today�s day of the week. Also prompt 
the user to enter the number of days after today for a 
future day and display the future day of the week. 
 */
import java.util.*;
public class WeekDays {
	public static void main(String [] args) {
		//class to get input
		Scanner input = new Scanner(System.in);
		//prompting user to get input 
		System.out.print("Enter today's day (Sunday is 0, \r\n"
				+ "Monday is 1� and Saturday is 6): ");
		int day = input.nextInt();
		//prompt to get get elapsed days
		System.out.print("Enter the number of days elapsed since today: ");
		int nextDay = input.nextInt();
		//formula to get future days
		int futureDay = (day + nextDay) % 7;
		//string variable
		String dayOfWeek = "";
		//switch statements for week days
		switch (day) {
		case 0: dayOfWeek = "Sunday";break;
		case 1: dayOfWeek = "Monday";break;
		case 2: dayOfWeek = "Tuesday";break;
		case 3: dayOfWeek = "Wednesday";break;
		case 4: dayOfWeek = "Thursday";break;
		case 5: dayOfWeek = "Friday";break;
		case 6: dayOfWeek = "Saturday";break;
		}
		//selection statements to display output
		if (futureDay == 0)
			System.out.println("Today is "+ dayOfWeek +" and future day is Sunday");
		else if (futureDay == 1)
			System.out.println("Today is "+ dayOfWeek +" and future day is Monday");
		else if (futureDay == 2)
			System.out.println("Today is "+ dayOfWeek +" and future day is Tuesday");
		else if (futureDay == 3)
			System.out.println("Today is "+ dayOfWeek +" and future day is Wednesday");
		else if (futureDay == 4)
			System.out.println("Today is "+ dayOfWeek +" and future day is Thursday");
		else if (futureDay == 5)
			System.out.println("Today is "+ dayOfWeek +" and future day is Friday");
		else if (futureDay == 6)
			System.out.println("Today is "+ dayOfWeek +" and future day is Saturday");
	}

}
