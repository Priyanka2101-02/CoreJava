package Multithreading;

public class ThreadEx implements Runnable{

	public static void main(String[] args) {
		Thread t1 = new Thread("Thread1");
		Thread t2 = new Thread("Thread2");
		t1.start();
		t2.start();
		System.out.println("Thread are: ");
		System.out.println(t1.getName());
		System.out.println(t1.getId());
		System.out.println(t2.getName());
		System.out.println(t2.getId());
		System.out.println(t1+" "+t2);
		
		
		

	}
	@Override
	public void run()
	{
		
		
	}

}
