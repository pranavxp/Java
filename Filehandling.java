package pranavlab;
import java.util.Scanner;
import java.io.*;
public class Filehandling {
	public static void main(String[] args) throws IOException {
		File f = new File("file.txt");
		if(f.exists())
		{
			System.out.println("File already exist");
		}
		else
		{
			f.createNewFile();
			System.out.println("File created");
		}
		FileOutputStream input = new FileOutputStream("file.txt");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int num= sc.nextInt();
		for (int i=1;i<=num;i++)
		{
			System.out.println("Enter element number "+i+":");
			int elements= sc.nextInt();
			input.write(elements);		
		}
		input.close();
		FileInputStream output = new FileInputStream("file.txt");
		int i;
		System.out.println("\nElements in the file are: ");
		while((i=output.read())!=-1)
		{
			System.out.print(i+"\t");
		}
		output.close();
	}

}
