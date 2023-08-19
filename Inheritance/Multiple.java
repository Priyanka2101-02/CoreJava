package inheritance;
/*
 * Multiple inhertiance is not supported in java.We can achieve multiple inhertitance using Interface
 * A subclass is having more than one superclass is called Multiple Inheritance 
 * class---class: extends
 * interface-----interface: extends
 * interface---class: implements 
 */
interface Walk
{
	void walk();
}
interface Run
{
	void run();
}
/*interface stop extends walk, Run
{
	
}*/

public class Multiple implements Walk,Run {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Run fast!!");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Walk Slow");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiple m1 = new Multiple();
		m1.run();
		m1.walk();
	
		
		
		

	}


}
