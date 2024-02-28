package uncheckedException;

import java.io.IOException;

public class ThrowExecutor {
	
 //Throws keyword is used to declare an exception
	static void isEligible(int age ,int weight) throws IOException
	{
		if(age>18 && weight>50)
		{
			System.out.println("Eligible to donate the blood");
		}
		else
			//Throw keyword is used to throw an exception
			throw new IOException ("Age and Weight criteria is not fullfilled");
	}

	public static void main(String[] args) throws IOException {
		isEligible(12,50);
	}

}

