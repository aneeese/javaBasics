package Basic.Assignment_2;
/*
 * MUHAMMAD ANEES
	FA20-BCS-045
	BCS-2A
	SUBMITTED TO SIR RIZWAN RASHID
 * Assume a vehicle plate number consists of three uppercase letters followed by four digits. Write a 
program to generate a plate number.
 */
import java.util.*;
public class VehiclePlateNumber {
	public static void main(String[] args) {
		//class to generate random alphabet
		Random random = new Random();
		String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; //alphabets stored 
		int count = 3; //numbers of times loop will execute 
		//loop to generate random string
		for (int i = 1; i <= count; i++) {
			//generating random index of variable alphabets
			int index = random.nextInt(alphabets.length());
			//using that index to print character
			char ch = alphabets.charAt(index);
			System.out.print(ch);
		}
		System.out.print(" ");
		//loop to generate random number
		for (int j = 0; j <= count; j++) {
			int num = (int)(Math.random() * 10);
			System.out.print(num);
		}

	}

}
