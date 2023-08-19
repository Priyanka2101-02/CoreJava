package inheritance;
class Fruit
{
	public Fruit()
	{
		System.out.println("I'm from Fruit Class!!");
	}
}
class Apple extends Fruit
{
	public Apple()
	{
		System.out.println("I'm from Apple Class!!");
	}
	void show()
	{
		System.out.println("Apple is good for health!!");
	}
}

class Mango extends Apple// Mango can access the properties of Fruit also
{
	public Mango()
	{
		System.out.println("I'm from Mango Class!!");
	}
	@Override
	void show()
	{
		super.show(); // it will call first parent class overriding method 
		System.out.println("Mango is king of Fruit!!");
	}
}

public class Multilevel {

	public static void main(String[] args) {
		/*
		 * We create the objcet of Mango class. it acquired all the class properties and output will be all class constructor 
		 */
		Mango m1 = new Mango();
		m1.show();
		

	}

}
