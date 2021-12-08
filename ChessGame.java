package Basic.Assignment_1;
/*MUHAMMAD ANEES
 * FA20-BCS-045
 * submitted to Sir Rizwan Rashid
Write a program that will receive the input of four numbers 
from 1 to 8, each specifying the column and row number, 
first two - for the first cell, and then the last two - for the 
second cell. The program should output YES if a king can 
go from the first cell to the second in one move
or NO otherwise.
 */
import java.util.*;
public class ChessGame {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		//prompting user to enter the column
        System.out.print("Enter column number: ");
        int column = in.nextInt();
        //prompting user to enter the row
        System.out.print("Enter row number: ");
        int row = in.nextInt();
        //prompting to get box number of column
        System.out.print("Enter box of column: ");
        int columnBox = in.nextInt();
        //prompting to get box number of row
        System.out.print("Enter box of row: ");
        int rowBox = in.nextInt();
        //conditions to check whether king can make a move or not
        if ((row-rowBox <= 1) && (column-columnBox <= 1) && (row = column) != (rowBox = columnBox))
            System.out.println(true);
        else
            System.out.println(false);
	}
}
