package Basic.SessionalsTerminal;
/*
MUHAMMAD ANEES 
FA20-BCS-045
BCS-2A
SUBMITTED TO SIR RIZWAN RASHID
*/
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of rows of array: ");
        int rows = input.nextInt();  
        System.out.println("Enter number of columns of array: ");
        int cols = input.nextInt();
        int array [][] = new int[rows][cols];//array of inputs
        System.out.println("Enter elements of array: ");
        //counting occurence of unique elements
        int uniqueCounts[] = new int[rows*cols];
        //storing unique elements
        int uniqueElements[] = new int[rows*cols];
        uniqueElements[0] = -1;
        int k = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                array[row][col] = input.nextInt();
                int p = 0;
                for(; p<k; p++)
                //compares if element is repeating/occuring twice
                    if (uniqueElements[p] == array[row][col]){
                        uniqueCounts[p]++;
                        break;
                    }
                    if (p == k) {
                        //if element is unique and occuring first time
                        uniqueElements[k] = array[row][col];
                        uniqueCounts[k]++;
                        k++;
                    }
            }
        }
        printingArray(array);
        //printing occurence of elements
        for (int i = 0; i < rows; i++) {
            System.out.println("The value " + uniqueElements[i] + " appears " + uniqueCounts[i] + " times");
        }
    }
    //method to print elements of array
    public static void printingArray(int[][] S) {
        for (int row = 0; row < S.length; row++){
            for (int col = 0; col < S[row].length; col++){
                System.out.print(S[row][col] + " ");
            }
            System.out.println();
        }
    }
}
