package Basic.Assignment_2;
/*
 * MUHAMMAD ANEES
 * FA20-BCS-045
 * BCS-2A
 * SUBMITTRD TO SIR RIZWAN RASHID
 * QUESTION: USING NESTED LOOPS TO PRINT A PYRAMID TYPE SHAPE
 */
public class Pyramid {
	public static void main(String[] args) {
		//variable initializing numbers from higher to lower side
		int rightSide = 0,
		//variable storing number of spaces in one row
		whiteSpaces = 7;
			//printing numbers and rows
			for (int row = 1; row <= 128; row += row) {
				//printing white spaces
				for (int space = 0; space < whiteSpaces; space++) {
					System.out.print("    ");
				}
				//printing numbers from lower to higher order
				for (int ascend = 1; ascend <= row; ascend += ascend) {
					System.out.printf("%4d", (ascend));
				}
				//printing numbers from higher to lower
				for (int decend = rightSide; decend > 0 ; decend /= 2 ) {
					System.out.printf("%4d", (decend));	
				}
				//moving to next line
				System.out.println();
				//decreasing white space variable for the 2nd loop
				whiteSpaces--;
				//assigning variable row to rightside
				rightSide = row;
			}
	}
}
