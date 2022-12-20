package pranavlab;
//program to check the frequency of a character in a string
import java.util.Scanner;

public class str_frequency {

	public static void main(String[] args) {
		int freq=0,i= 0;
		char c;
		System.out.println("Enter the string to find frequency");
		Scanner sc = new Scanner (System.in);
		String str= sc.nextLine().toLowerCase();
		int n=str.length();
		System.out.println("Enter the character to count :");
		c = sc.next().toLowerCase().charAt(i);
		for(i=0;i<n;i++)
		{
				if(c==str.charAt(i))
					freq++;
		}
		System.out.println("Frequency= "+freq);
	}

}
