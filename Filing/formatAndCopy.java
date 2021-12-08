/*
MUHAMMAD ANEES
FA20-BCS-045
SUBMITTED TO SIR RIZWAN RASHID
LAB ASSIGNMENT QUESTION 2
*/
package Basic.Assignment_4;
import java.io.*;
import java.util.*;
public class formatAndCopy {
    public static void main(String[] args)throws IOException{
        Scanner in = new Scanner(System.in);
        //getting input file 
        System.out.print("Enter a input file: ");
        String inputFile = in.next();
        File INPUTFILE = new File(inputFile);
        if (!INPUTFILE.exists()){
            System.out.print("File not found");
            System.exit(1);
        }
        //getting output file from user
        System.out.print("Enter a output file: ");
        String outputFile = in.next();
        File OUTPUTFILE = new File(outputFile);
        if (!OUTPUTFILE.exists()){
            System.out.print("File not found");
            System.exit(2);
        }
        in.close();
        String copiedInput = "";
        //using bufferReader to read data from input file
        BufferedReader input = new BufferedReader(new FileReader(INPUTFILE));
        //printWriter to print formatted data onto output file
        PrintWriter output = new PrintWriter(new FileOutputStream(OUTPUTFILE,true));
        //loop to read data from file
        while ((copiedInput = input.readLine()) != null){
            //storing a line in an character array
            char [] chars = copiedInput.toCharArray();
            //captalizing first letter
            chars[0] = Character.toUpperCase(chars[0]);
            copiedInput = new String(chars);
            //replacing more than one whitespaces with single whitespace using trim
            copiedInput = copiedInput.replaceAll("\\s+", " ").trim();
            //captalizing first letter of every sentence using substring and built in methods
            copiedInput = copiedInput.substring(0,1).toUpperCase() + copiedInput.substring(1);
            //adding whitespace after completion of every sentence
            copiedInput = copiedInput.replace("?", "? ").replace("!", "! ").replace(".", ". ");
            //triming again if more than 1 whitespaces are present
            copiedInput = copiedInput.replaceAll("\\s+", " ").trim();
            System.out.println(copiedInput);
            //writing in output file
            output.println(copiedInput);
        }
        System.out.print("Successfully copied!");
        input.close();
        output.close();
    }
    
}
