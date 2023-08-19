package inheritance;
class Parent // Parent class
{
	void father()
	{
		System.out.println("I'm father!!");
	}
}
class Child extends Parent// extending the method of parent class 
{
	void child()
	{
		System.out.println("I'm Child!!");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c1 = new Child();// creating object only of child class 
		c1.child();
		c1.father();

	}

}
