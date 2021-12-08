package Basic.SessionalsTerminal;
/*
 * Muhammad Anees
 * FA20-BCS-045
 * Section: BCS-2A
 * Submitted to Sir Rizwan Rashid
 Question: 
You are required to develop a program that asks three (03) Multiple Choice Questions (MCQs) from the user. The 
program must ask questions along with options (one at a time) and the user is required to enter correct answer from the 
given options. In MCQs Test each question carry equal score (suppose a score of 10 for each correct answer). You need 
to calculate total score of the MCQ Test keeping in mind following points:
1- For correct answer � award the full score (10)
2- For incorrect answer � deduct 2 from the total score
3- For invalid choice � deduct 5 from the total score
 */
import java.util.*;
public class Sessionalq1 {
	public static void main(String[] args) {
		//class to get input from user
		Scanner in = new Scanner(System.in);
		//variable for total marks
		int marks = 0;
		System.out.print("Choose a correct option for the given questions");
		//loop for 3 MCQs
		for (int count = 0; count < 4 ; count++) {
			//Question#01
			if (count == 1) {
				System.out.print("\nQuestion 1: Pakistan won the cricket World Cup in:\r\n"
						+ "1. 1992\r\n"
						+ "2. 1996\r\n"
						+ "3. 1999\r\n"
						+ "4. 2003\r\n"
						+ "Enter your answer (1/2/3/4): ");
				//storing answer given by user
				int answer = in.nextInt();
				//conditions to give marks to user according to answer
				//1st condition when user enters invalid answer
				if ((answer != 1) && (answer != 2) && (answer != 3) && (answer != 4)) {
					marks -= 5;
					System.out.print("The user enters invalid choice. \nTotal score is "
							+ marks + " after 5 is deducted.\n");
				}
				//2nd condition when user enters correct answer
				else if (answer == 1) {
					marks += 10;
					System.out.print("The user enters correct answer. \nTotal score is "+ marks+"\n");
				}
				//3rd condition when user enters incorrect answer
				else if (answer != 1) {
					marks -= 2;
					System.out.print("The user enters incorrect answer. \nTotal score "
							+ "is "+ marks+ " after 2 is deducted.\r\n");
				}
			}
			//Question # 02
			else if (count == 2) {
				System.out.print("\nQuestion 2: The national language of Pakistan is:\r\n"
					+ "1. Pushto\r\n"
					+ "2. Sindhi\r\n"
					+ "3. Urdu\r\n"
					+ "4. Punjabi\r\n"
					+ "5. Balochi\r\n"
					+ "Enter your answer (1/2/3/4/5): ");
			//storing answer given by user
			int answer = in.nextInt();
			//1st condition when user enters invalid answer
			if ((answer != 1) && (answer != 2) && (answer != 3) && (answer != 4) && (answer != 5)) {
				marks -= 5;
				System.out.print("The user enters invalid choice. \nTotal score is "
						+ marks + " after 5 is deducted.\n");
			}
			//2nd condition when user enters correct answer
			else if (answer == 3) {
				marks += 10;
				System.out.print("The user enters correct answer. \nTotal score is "+ marks+"\n");
			}
			//3rd condition when user enters incorrect answer
			else if (answer != 3) {
				marks -= 2;
				System.out.print("The user enters incorrect answer. \nTotal score "
						+ "is "+ marks+ " after 2 is deducted.\r\n");
				}
			}
		//Question # 03
		else if (count == 3) {
			System.out.print("\nQuestion 3: The national game of Pakistan is:\r\n"
					+ "1. Cricket\r\n"
					+ "2. Hockey\r\n"
					+ "3. Football\r\n"
					+ "4. Tennis\r\n"
					+ "Enter your answer (1/2/3/4): ");
			//storing answer given by user
			int answer = in.nextInt();
			//1st condition when user enters invalid answer
			if ((answer != 1) && (answer != 2) && (answer != 3) && (answer != 4)) {
				marks -= 5;
				System.out.print("The user enters invalid choice. \nTotal score is "
						+ marks + " after 5 is deducted.\n");
			}
			//2nd condition when user enters correct answer
			else if (answer == 2) {
				marks += 10;
				System.out.print("The user enters correct answer. \nTotal score is "+ marks+"\n");
			}
			//3rd condition when user enters incorrect answer
			else if (answer != 2) {
				marks -= 2;
				System.out.print("The user enters incorrect answer. \nTotal score "
						+ "is "+ marks+ " after 2 is deducted.\r\n");
				}
			}
		}
		
	}
}
