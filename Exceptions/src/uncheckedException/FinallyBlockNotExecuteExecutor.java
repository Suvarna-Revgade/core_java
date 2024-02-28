package uncheckedException;

import java.util.Scanner;

public class FinallyBlockNotExecuteExecutor {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the values of X and Y:");
		 int x=sc.nextInt();//12
		 int y=sc.nextInt();//0
		 //Try block contain exception code
		 try
		 {
			 System.out.println(x/y);
			 /*When we use System.exit(0),then finally block does not Executed*/
			 System.exit(0);
		 }
		 //Catch block is used to handle exception
		 catch(Exception e)
		 {
			 System.out.println("Exception Handled :"+e);
			 /*When we use System.exit(0),then finally block does not Executed*/
			 System.exit(0);
		 }
		 finally
		 {
			 /*When finally block contain exception then finally block
			  * does not execute
			  */
			// System.out.println(4/0);
			 System.out.println("Finally block executed");
		 }
		 
	}

}
