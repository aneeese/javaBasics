/*
MUHAMMAD ANEES
FA20-BCS-045
SUBMITTED TO SIR RIZWAN RASHID
CLASS ASSIGNMENT QUESTION 1
*/
package Basic.Assignment_4;
import java.io.*;
import java.util.*;
public class writeIntegers {
    public static void main(String[] args) throws IOException{
        //random class to generate random numbers
        Random random = new Random();
        String path = "Text_IO.txt";
        File file = new File(path);
        //if file not found, creating new file
        if (!file.exists()){
            file.createNewFile();
        }
        //using Buffer to write on the file
        BufferedWriter output = new BufferedWriter(new FileWriter(file,true));
        //loop to write 100 integers on file
        for (int i = 0; i <= 100; i++){
            int randomNumber = random.nextInt(100);
            output.write(randomNumber + " ");
        }
        output.newLine();
        output.close();
        System.out.print("Successfully wrote to the file");
    }
}
