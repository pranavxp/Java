package pranavlab;
import java.io.*;
public class Filehandlingreadwrite {

	public static void main(String[] args) throws IOException{
		File f=new File("Read.txt");
		if(f.exists())
		{
			System.out.println("File already exists!\n");
		}
		else
		{
			f.createNewFile();
			System.out.println("New File created\n");
		}
		FileWriter write =new FileWriter("Read.txt");
		BufferedReader reading=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the text: ");
		String str =reading.readLine();
		write.write(str);
		write.close();
		FileReader read =new FileReader("Read.txt");
		BufferedReader writing=new BufferedReader(read);
		System.out.println("\nThe text is :");
		while((str=writing.readLine())!= null)
		{
			System.out.print(str);
		}
		writing.close();

	}

}
