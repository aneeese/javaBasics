/*
MUHAMMAD ANEES
FA20-BCS-045
SUBMITTED TO SIR RIZWAN RASHID
LAB ASSIGNMENT QUESTION 1
*/
package Basic.Assignment_4;
import java.util.Scanner;
import java.io.*;
public class checkingNumbers {
    public static void main(String[] args)throws IOException{
        Scanner input = new Scanner(System.in);
        //Getting input from user
        System.out.print("Enter file name:(abc.txt): ");
        String path = input.next();
        input.close();
        File myFile = new File(path);
        //if file not found
        if (!myFile.exists()){
            System.out.print("File not found");
            System.exit(1);
        }
        //variables for numbers
        int largest = 0, smallest = 0, sum = 0 , count = 0, num = 0;
        //scanner to read from file
        Scanner Input = new Scanner(myFile);
        //initializing input from file
        largest = Input.nextInt();
        smallest = largest;
        num = largest;
        sum = largest;
        System.out.print("The numbers in the file are ");
        while (Input.hasNext()){
            //condition if all data is readed from file
            if (!Input.hasNext()){
                System.exit(1);
            }
            //finding largest, smallest and average
            num = Input.nextInt();
            //printing numbers in the file
            System.out.print(num + " ");
            sum += num;
            if (num > largest){
                largest = num;
            }
            else if (num < smallest){
                smallest = num;
            }
            count++;
        }
        Input.close();
        System.out.println();
        System.out.println("Largest number is " + largest + "\n" +
        "Smallest number is " + smallest + "\n" + "Average is " + (int)(sum/count));
    }    
}
