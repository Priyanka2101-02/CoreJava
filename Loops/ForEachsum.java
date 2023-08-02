package loopClass;

public class ForEachsum {

	public static void main(String[] args) {
		int sum=0;
		int[] arr= {50,87,56,36,47};
		for(int arra: arr)
		{
			
			
			System.out.println(arra);
			sum = sum+arra;
			
		}
		System.out.println("The sum of array elemnts is: "+sum);

	}

}
