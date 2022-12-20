package pranavlab;
//program for performing arithmetic operations
import java.util.Scanner;

public class arith_op {

	public static void main(String[] args) {
		int x,y,s,d,p,q;
		System.out.println("Enter the first number");
		Scanner sc = new Scanner (System.in);
			x = sc.nextInt();
		System.out.println("Enter the second number");	
		Scanner sca = new Scanner (System.in);
			y= sc.nextInt();
			
			s=x+y;
			d=x-y;
			p=x*y;
			q=x/y;
			System.out.println("The sum is "+s);	
			System.out.println("The difference is "+d);
			System.out.println("The product is  "+p);
			System.out.println("The quotient is "+q);
	}

}
