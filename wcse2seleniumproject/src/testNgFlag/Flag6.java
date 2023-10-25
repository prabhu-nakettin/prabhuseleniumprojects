package testNgFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6 
{
	@Test(enabled =true)
	public void login() 
	{
		Reporter.log("login method",true);
	}

	@Test(enabled =false) 			// false it will enabled the value it will not execuate that Annotation
	public void logout() 
	{
		Reporter.log("logout method",true);
	}
}

