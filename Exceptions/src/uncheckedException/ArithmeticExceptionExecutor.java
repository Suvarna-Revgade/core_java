package uncheckedException;

import java.util.Scanner;
public class ArithmeticExceptionExecutor {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the values of X and Y:");
	 int x=sc.nextInt();
	 int y=sc.nextInt();
	 //Try block contain exception code
	 try
	 {
		 System.out.println(x/y);
	 }
	 //Catch block is used to handle exception
	 catch(Exception e)
	 {
		 System.out.println("Exception Handled :"+e);
	 }
	}

}
