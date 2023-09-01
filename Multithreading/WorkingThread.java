package Multithreading;

public class WorkingThread implements Runnable{

	private Thread t;
	private String tname;
	WorkingThread(String name)
	{
		tname=name;
		System.out.println("Creating: "+tname);
	}
	
	public void run()
	{
		System.out.println("Running: "+tname);
		for(int i=4;i>0;i--)
		{
		System.out.println("Thread: "+tname+" "+i);
		try {
			Thread.sleep(30); // thread will sleep for 30sec
		} 
		catch (InterruptedException e) 
		{
			System.out.println("Thread: "+tname+" Interuupted");
			e.printStackTrace();
		}
		System.out.println("Thread: "+tname+" Existing");
		}
	}
	public void start()
	{
		System.out.println("Thread Started: "+tname);
		if(t==null)
		{
			t=new Thread(this, tname);
			t.start();
		}
	}
		
	public static void main(String[] args) {
		
		WorkingThread wt =new WorkingThread("Hello");
		wt.run();
		wt.start();
		

	}
	
}


