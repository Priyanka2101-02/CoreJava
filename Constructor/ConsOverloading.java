package constructor;
class Overload{
	/*
	 * Constructor Overloading--> Constructor name is same but its arguement or parameter id diffrent 
	 * then it called constructor overloading .
	 */
	double pi=3.17, r;
	//float l, b;
	Overload()
	{
		System.out.println("No Arguement Constructor");
	}
	Overload(double rad)
	{
		r = rad;
		System.out.println("Area of Circle: "+(pi*r*r));
	}
	Overload(float l, float b )
	{
		l =l;
		b =b;
		System.out.println("Area of Rectangle: "+(l*b));
	}
	
}

public class ConsOverloading {

	public static void main(String[] args) {
		Overload a =new Overload();
		Overload a1 =new Overload(2.4);
		Overload a2 =new Overload(5,6);
		
		

	}

}
