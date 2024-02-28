package customException;

//Private data member program to demonstrate on User-defined Exception
public class LoginCredentials extends Exception {
	//Private data member
	private String str;
	
	//getter and setter
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		return "LoginCredentials [str=" + str + "]";
	}

	//Parameterized constructor
	public LoginCredentials(String str) {
		super();
		this.str = str;
	}
	
	

}
