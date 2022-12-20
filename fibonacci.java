package pranavlab;
//program to print the Fibonacci series

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		int num1=0,num2=1,x,sum=0,i;
		System.out.println("Enter the upper limit");
		Scanner sc = new Scanner (System.in);
		 x= sc.nextInt();
		 for(i=1;i<=x;i++)
		 {
			 System.out.println(num1+" ");
			 sum=num1+num2;
			 num1=num2;
			 num2=sum;
		 }
		
	}

}
