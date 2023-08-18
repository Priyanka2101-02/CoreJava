package array;

public class ShallowCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Shallow copy is created for multi dimensional array
		 * the memory location of both original array and cloned array elements is same
		 * when we update cloned array it will be directly affect into original array 
		 */
		int[][] arr = {{1,2,3,4,5},
				 		{4 ,10, 26, 56 }};
		int[][]arr1 = arr.clone();
		for(int i = 0; i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr1[i][j]+"\t");
			}
			System.out.println();
		}
		for(int i = 0; i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				System.out.print(arr1[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println(arr[0]==arr1[0]);
		System.out.println(arr1[1]==arr[1]);
		System.out.println();
		System.out.println(arr[0]);
		System.out.println(arr1[0]);
		
		
	}

}
