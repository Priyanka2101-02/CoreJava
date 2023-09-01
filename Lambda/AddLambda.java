package lambda;
interface Add
{
	void add(int num, int num1);
}

public class AddLambda {

	public static void main(String[] args) {
		Add a1;// object reference 
		/*
		 * lambda expression: Taking arguements and arrow operator points to print the addition of two number
		 */
		a1=(num,num1)->System.out.println("Addition of two number: "+(num+num1));
		a1.add(10, 5);
	}

}
