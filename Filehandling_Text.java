package pranavlab;
import java.io.*;
public class Filehandling_Text{
	public static void main(String[] args)throws IOException{
		File f=new File("Text.txt");
		if(f.exists())
		{
			System.out.println("File already exists!\n");
		}
		else
		{
			f.createNewFile();
			System.out.println("New File created\n");
		}
		try
		{
			FileOutputStream fout=new FileOutputStream("Text.txt");
			BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter the text: ");
			String str=buffer.readLine();
			byte[] b=str.getBytes();
			fout.write(b);
			fout.close();
		}
		catch(Exception e)
		{
			System.out.println("File not found!\n");
		}
		int i;
		FileInputStream fin=new FileInputStream("Text.txt");
		System.out.println("\nThe number of elements: "+fin.available());
		System.out.print("\nText inside the file is: \n");
		while((i=fin.read())!=-1)
		{
		char c=(char)i;
		System.out.print(c);
		}
		fin.close();
	}
}