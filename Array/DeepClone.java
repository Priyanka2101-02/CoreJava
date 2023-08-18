package array;

public class DeepClone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {7,10,45,89,};
		int[] arrclone = arr.clone();
		for(int i = 0; i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		for(int i = 0; i<arrclone.length;i++)
		{
			System.out.print(arrclone[i]+"\t");
		}
		System.out.println();
		System.out.println(arr);
		System.out.println(arrclone);
		/*
		 * Deep cloning is done only for single dimensional array
		 * after cloning the location of actual array and cloned array is different i.e 
		 * they both are stored in different array location 
		 * 
		 */

	}

}
