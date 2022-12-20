package pranavlab;
//program to check if a string is a palindrome or not
import java.util.Scanner;

public class palindrome_str {

	public static void main(String[] args) {
		int j;
		String revstr = "";
		System.out.println("Enter the string to check for palindrome");
		Scanner sc = new Scanner (System.in);
		String str= sc.nextLine().toLowerCase();
		int n=str.length();
		for(j=n-1;j>=0;j--)
		{
			revstr = revstr+str.charAt(j);			
		}
		if(str.equals(revstr))
		{
			System.out.println("The entered string is palindrome");
		}
		else
			System.out.println("The entered string is not palindrome");
	
	}

}
