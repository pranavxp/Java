package pranavlab;
//program for inputing and printing integer and string
import java.util.Scanner;

public class int_str_read {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt();
		System.out.println("The entered number is "+x);
		System.out.println("Enter a string ");
		Scanner sca = new Scanner (System.in);
		String y=sca.nextLine();
		System.out.println("Entered string is "+y);



	}

}
