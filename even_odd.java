package pranavlab;
//program for checking if a number is even or odd
import java.util.Scanner;

public class even_odd {

	public static void main(String[] args) {
		int x;
		System.out.println("Enter a number to check whether it is even or odd");
		Scanner sc = new Scanner (System.in);
		x = sc.nextInt();
		if (x%2 == 0)
			System.out.println("Entered number is even");
		else
			System.out.println("Entered number is odd");

		

	}

}
