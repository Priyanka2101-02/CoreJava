package method;

public class MethodOverloading {
	void add(int num, int num1)
	{
		System.out.println("Addtion is: "+(num+num1));
	}
	void add(float num, int num1)
	{
		System.out.println("Addtion is: "+num+num1);
	}
	void add(int num, float num1)
	{
		System.out.println("Addtion is: "+num+num1);
	}
	void add(int num, int num1, int num2)
	{
		System.out.println("Addtion of three numbers: "+(num+num1+num2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading  m1 = new MethodOverloading ();
		m1.add(10,20);
		m1.add(5.8f, 10);
		m1.add(58, 2.1f);
		m1.add(56,23,45);
		

	}

}
