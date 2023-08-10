package method;
/*
 * -> To achieve Method overriding we need at least single inheritance 
 * -> Method name is same and its signature is also same then it is called method overriding
 *->  The method declared in parent class is called overridden method and method declared in child class 
 * ->  is called overriding method
 * -> Method overriding is used to run time polymorphism  
 * -> The method declared static cannot be overriden but it can redeclared. 
 */
class Parent
{
	void show()// overriden Method
	{
		System.out.println("This is Parent class Method");
	}
	
}
class Child extends Parent
{
	void show()// Overriding method
	{
		//super.show();
		System.out.println("This is Child class Method");
	}
}

public class MethodOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c1 = new Child();
		c1.show();

	}

}
