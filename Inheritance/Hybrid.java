package inheritance;
/*
 * In Java, the hybrid inheritance is the composition of two or more types of inheritance.
 * we can achieve using class and interface 
 */
class Reader
{
	void read()
	{
		System.out.println("Reading is good habit ");
	}
	
}
interface Writer
{
	void write();
}
interface Traveller
{
	void travel();
	
}
// Hybrid class inherted the properties of class and interfaces
public class Hybrid extends Reader implements Writer, Traveller {
	@Override
	public void write()
	{
		System.out.println("Writing help you to improve handwriting");
	}
	@Override
	public void travel()
	{
		System.out.println("traveling give the peace");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hybrid h1= new Hybrid();
		h1.read();
		h1.write();
		h1.travel();
	}

}
