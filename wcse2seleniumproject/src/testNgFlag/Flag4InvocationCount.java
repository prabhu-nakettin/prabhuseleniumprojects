package testNgFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4InvocationCount // it is used to execute the count of testing like  Regresion testing 
{                                // it is  like a ForLooop data type is Integer
	@Test
	public void login()
	{
		Reporter.log("login in!!"); 
	}

	@Test(invocationCount =20)
	public void createUser() 
	{
		Reporter.log("usercreated");

	}

	@Test(invocationCount = 30)
	public void logout() 
	{
		Reporter.log("Logged out");
	}
}







