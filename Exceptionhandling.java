package pranavlab;
import java.util.Scanner;
public class Exceptionhandling {

	public static void main(String[] args) {
		while(true)
		{
			try
			{
				int num1,num2,result;
				Scanner sc=new Scanner(System.in);
				System.out.print("Enter the first number:");
				num1 =  sc.nextInt();
				System.out.print("Enter the second number:");
				num2 =  sc.nextInt();
				result = num1/num2;
				System.out.print("The result is: "+result);
				System.out.println("\n");				
			}
			catch(ArithmeticException e)
			{
				System.out.println("Error : "+e.getMessage());
				System.out.println("Error : "+e);
			}
			finally
			{
				System.out.println("End of program!");
			}
			System.out.println("Do yo wish to continue:Y/N");
			Scanner sca=new Scanner(System.in);
			String s = sca.next();
			if("n".equalsIgnoreCase(s))
			{
				System.out.println("Program Ended");
				break;
			}
		}
	}
}
