package operator;

public class logicalOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 10;
		int num2 = 20;
		if(num1!=num2 && num1<num2) // This operator returns true if both statement are true otherwise it will return false
		{
			System.out.println("True");
		}else {
		System.out.println("False");}
		
		if(num1==num2 || num1!=num2) //This operator returns true if at least one  statement is true otherwise it will return false
		{
			System.out.println("True");
		}else {
		System.out.println("False");}
		
		
		if(!(num1<num2)) {
			System.out.println("False");
		}

	}

}
