package Multithreading;
class Table
{
	synchronized void print(int n)// synchronized will print the output Synchronizely  
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+(n*i));
		}
		
	}
}
	class thread1 extends Thread
	{
		Table tl = new Table();
		int num;
		thread1(Table t1, int num)
		{
			this.tl=t1;
			this.num=num;
		}
		public void run()  // when thread start thid=s method will autmatically call
		{
			tl.print(num);
		}
	}


public class PrintTable  extends Thread {

	public static void main(String[] args) throws InterruptedException {

		Table tl = new Table();
		thread1 th = new thread1(tl,5);
		thread1 th1 = new thread1(tl,2);
		th.sleep(30);//th will go in  sleep for 30sec so that th1 will display first and the th will print  
		th.start();
		th1.start();

	}

}
