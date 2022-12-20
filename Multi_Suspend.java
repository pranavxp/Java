package pranavlab;

class Threading extends Thread { 
	Thread t;
	Threading(){
		t = new Thread(this);
		t.start();
	}
	
	public void run() {
		for (int D = 1; D < 8; D++) {
			try {
				System.out.println(D);
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		System.out.println("End of Thread 1");
	}
}


class Threading2 extends Thread { 
	Thread t;
	Threading2(){
		t = new Thread(this);
		t.start();
	}
	
	public void run() {
		for (char D = 'A'; D < 'O' ; D++) {
			try {
				System.out.println(D);
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		System.out.println("End of Thread 2");
	}
}

public abstract class Multi_Suspend implements Runnable  {
	@SuppressWarnings({ "removal" })
	public static void main(String[] args) {
		
		Threading TT1 = new Threading();
		Threading2 TT2 = new Threading2();
		try {
			Thread.sleep(1000);
			System.out.println("Suspending Thread 1 \n");
			TT1.t.suspend();
			Thread.sleep(1000);
			
			System.out.println("Suspending Thread 2");
			TT2.t.suspend();
			Thread.sleep(1000);
			
			System.out.println("Resuming Thread 1 and Thread 2\n");
			TT1.t.resume();
			TT2.t.resume();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}