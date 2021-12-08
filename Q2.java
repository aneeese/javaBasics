package Basic.SessionalsTerminal;
/*
MUHAMMAD ANEES 
FA20-BCS-045
BCS-2A
SUBMITTED TO SIR RIZWAN RASHID
*/
import java.io.*;
import java.util.*;
public class Q2 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your 1st Name and Reg# separated by - : ");
        //Declaring Ragged Array
        String [][] array = new String [2][];
        array[0] = new String[1];
        array[0][0] = input.next();
        //calling method to write in file
        try {
            writingInFile(array);
        } catch (Exception e) {
            e.printStackTrace();
        }  
    }
    //method to write in file
    public static void writingInFile(String [][] S) throws Exception {
    try {
        File file = new File("File.txt");
        if (!file.exists()){
            file.createNewFile();
        }
        PrintWriter output = new PrintWriter(new FileWriter(file,true));
        output.println(S[0][0]);
        output.close();
        System.out.print("Successfully wrote to the file");
    }
    catch (Exception e){
        System.out.print("Exception occurs");
    }
}
}
