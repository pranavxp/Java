package pranavlab;
import java.util.Scanner;

public class prime {

	public static void main(String[] args) {

		int num,i,flag=0;
		System.out.println("Enter a number to check whether it is prime or not ");
		Scanner sc = new Scanner (System.in);
		num = sc.nextInt();
		for(i=2;i<num;i++)
		{
			if(num%i==0)
			{	flag=1;
				break;
			}
				
		}
		
		if(flag==0)
		{
			System.out.println("The entered number is prime");			
		}	
		else
			{
				System.out.println("The entered number is not prime");
			}

	}

}
