package pranavlab;
//program to convert integer values to character using ASCII values

import java.util.Scanner;

public class ASCII {

	public static void main(String[] args) {
		int num;
		char ch;
		System.out.println("Enter a number to convert to character");
		Scanner sc = new Scanner (System.in);
		num= sc.nextInt();
		ch = (char) (num + 64);

		System.out.println("The character in ASCII is "+ch);
		


	}

}
