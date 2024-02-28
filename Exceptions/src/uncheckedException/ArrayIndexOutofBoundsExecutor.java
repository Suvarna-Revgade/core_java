package uncheckedException;

/* Program to demonstrate on ArrayIndexoutofBoundException*/
public class ArrayIndexOutofBoundsExecutor {
	
	static void print(int arr[])
	{
		try
		{
		System.out.println(arr[3]);
		}
		catch(Exception e)
		{
			
			System.out.println("Exception Handled:"+e);
		}
		finally
		{
			System.out.println("Finally block is always Executed");
		}
	}
		

	public static void main(String[] args) {
	
		int arr[]= {12,3,17};
		print(arr);
	}

}
