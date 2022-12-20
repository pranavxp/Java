package pranavlab;
import java.util.*;
class Multiply
{
	void print(int n)
	{
		synchronized(this) 
		{
			for(int i=1;i<=5;i++) 
			{
				System.out.println(n+"*"+i+"="+(n*i));
				try 
				{
					Thread.sleep(100);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
		}
	}
}
class Table extends Thread
{
	Multiply multi;
	int num1;
	Table(Multiply multiple,int num)
	{
		multi=multiple;
		num1=num;
	}
	public void run()
	{
		multi.print(num1);
	}
}
public class Multi_Sync
{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		Multiply multiple=new Multiply();
		System.out.println("Enter the first table you want to run using thread");
		int num=sc.nextInt();
		Table table1=new Table(multiple,num);
		System.out.println("Enter the second table you want to run using thread:");
		num=sc.nextInt();
		Table table2=new Table(multiple,num);
		System.out.println("Enter the third table you want to run using thread1:");
		num=sc.nextInt();
		Table table3=new Table(multiple,num);
		table1.run();
		table2.run();
		table3.run();
		sc.close();
	}
}