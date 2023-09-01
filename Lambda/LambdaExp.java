package lambda;
interface A
{
	void show(String x, int z);
	
}
//Class B is used for only implementation of interface A
/*class B implements A{
	
	public void show()
	{
		System.out.println("Hello!!!!!!!");
		
	}
}*/

public class LambdaExp {

	public static void main(String[] args) {
		A obj;
		//B o=new B();
		//o.show();
		
		//Anonymous inner class
		/*A obj;// we cant able to create an object of interface but we can create reference of an interface 
		obj=new A()
				{
					public void show()
					{
						System.out.println("Welcome!!!");
					}
				};
				obj.show();*/
		
		//lambda Expression
		obj=(x,z)->System.out.println("Lambda Expression"+x+z);
		obj.show("in Java",8);
		
	}

}
