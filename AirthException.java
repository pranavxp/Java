package pranavlab;
import java.util.Scanner;
public class AirthException {
	public static void main(String[] args) {
		try {
			System.out.println("Enter the First number");
			Scanner sc = new Scanner(System.in);
			int num1 = sc.nextInt();
			System.out.println("Enter the Second number");
			int num2 = sc.nextInt();
			if (num2==0)				
			{
				System.out.println("Number can't be divided by zero");
				throw new ArithmeticException("Arithmetic exception occured");
			}
			else	
			{
				int result=num1/num2;
				System.out.println("The result is: "+result);
			}
			}	
		catch(ArithmeticException e){
			
			System.out.println(e);
		}
	}
}
	
