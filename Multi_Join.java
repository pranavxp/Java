package pranavlab;
class Thread1 extends Thread{
	public void run()
	{
		for(int i=1;i<=5;i++) 
		{
			System.out.println(i);
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
			System.out.println(e);
			}
		}
	}
}
class Thread2 extends Thread{
	public void run()
	{
		for(char i='a';i<='e';i++)
		{
			System.out.println(i);
			try 
			{
				Thread.sleep(500);
			}
			catch(Exception e) 
			{
				System.out.println(e);
			}
		}
	}
}
public class Multi_Join{
	public static void main(String[]args)
	{
		Thread2 thread1=new Thread2();
		Thread1 thread2=new Thread1();
		try 
		{
			thread1.start();
			thread1.join();
			thread2.start();
			thread1.join();
		}
		catch(Exception e)
		{
			
		}
	}
}