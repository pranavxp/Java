package pranavlab;
//program to print factorial of a number

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		int num,i,fact=1;
		System.out.println("Enter the number whose factorial is to be found");
		Scanner sc = new Scanner (System.in);
		num = sc.nextInt();
		if(num==0){
			System.out.println("The factorial of "+num+" is "+num);
		}
		else
		{
			for(i=1;i<=num;i++)
			{
				fact=fact*i;
			}
			System.out.println("The Factorial of "+num+" is "+fact);
		}
	}

}
