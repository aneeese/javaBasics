package Basic.Assignment_2;
/*
 * MUHAMMAD ANEES
	FA20-BCS-045
	BCS-2A
	SUBMITTED TO SIR RIZWAN RASHID
 Question:
 * Write a program that displays all the leap years, ten per line, from 101 to 2100, separated by 
exactly one space. Also display the number of leap years in this period.
 */
public class LeapYears {
	public static void main(String[] args) {
		int count = 0; //variable to print 10 numbers per line
		//loop from year 101 to 2100 years
		for(int year = 100; year <= 2100; year++) {
			//selection statement to check leap year
			if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
				count++;
				System.out.printf("%5d",year);
				//selection statement to move to the next line
				if (count == 10) {
					System.out.println();
					count = 0;
				}
			}
		}
	}
}
