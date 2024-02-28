package SingleDimensionalArray;
import java.util.Arrays;
import java.util.Scanner;
//Program to demonstrate runtime array And to find out largest element in array
public class ArrayMax {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of element in an Array:");
		int n=sc.nextInt();
		//Array Declaration
		int arr[]=new int[n];
		//Array initialization
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Array Elements Are:");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}  
		System.out.println();
		int max=arr[0];
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Maximum Element is:"+max);
		//Arrays is a class and sort is the built in method
		System.out.println("Sorted Array :");
		Arrays.sort(arr);
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	

}
