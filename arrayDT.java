package myPackage;

public class arrayDT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[10];
		arr[0]= 10;
		arr[1]= 20;
		arr[2]= 30;
		arr[3]= 40;
		arr[4]= 50;
		for(int i=0;i<5;i++)
		{
			System.out.println("Array value " +arr[i]+"\n");
		}
		int arr1[]= {101,102,103,104,105}; //literal way to declare an array
		System.out.println("Length of array is "+arr1.length+"\n");
		for(int i=0; i<arr1.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
