package customException;
import java.util.Scanner;

//prg for user defined exception 
//driver class
public class CustomExceptionExecutor {

	public static void main(String[] args) throws LoginCredentials {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Email and Password");
		String email=sc.nextLine();
		String password=sc.nextLine();
		try
		{
		if(email.equals("skumbhalkar@tnsif.org") && password.equals("pass@123"))
		{
			System.out.println("Credentials Matched");
			
		}
		else
		{
			throw new LoginCredentials("Invalid Credentials");
		}
		}
		catch(LoginCredentials e)
		{
			System.out.println(e);
		}
		
	}

}
