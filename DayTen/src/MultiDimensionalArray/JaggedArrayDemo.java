package MultiDimensionalArray;

import java.util.Scanner;
public class JaggedArrayDemo {

	public static void main(String[] args) {
		/*In jagged array outside array size is fix 
		 * but inside array size is different for different 
		 * outside array index
		 */
		Scanner sc=new Scanner(System.in);
		//Jagged Array Declaration
		int arr[][]=new int[2][];
		//for outside array index 0,storing 3 elements
		arr[0]=new int[3];
		//for outside array index 1,storing 2 elements
		arr[1]=new int[2];
		System.out.println("Enter Array Elements");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
			arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
			System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
