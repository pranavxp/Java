package pranavlab;
import java.util.Scanner;

//To display the palindrome of a number
public class palindrome_of_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,digit,num=0,temp;
		System.out.println("Enter the number to be reversed");
		Scanner sc = new Scanner (System.in);
		x = sc.nextInt();
		temp = x;
		System.out.println("Entered number to be reversed is "+x);
		while(x!=0){
			digit=x%10;
			x=x/10;
			num=num*10+digit;
		}
		System.out.println("Reversed number is "+num);
		if(temp==num)
			System.out.println("The entered number is palindrome");
		else
			System.out.println("The entered number is not a palindrome");
	}

}
