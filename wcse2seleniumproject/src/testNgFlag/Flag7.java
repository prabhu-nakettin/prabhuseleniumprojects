package testNgFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag7 {
	@Test
	public void login()
	{
		int res=5/0;
		Reporter.log("login method",true);
	}
	@Test(dependsOnMethods ="login",alwaysRun =true)  //which method is skip that method it will execucated
	public void createUserMethod() 
	{
		Reporter.log("create user method",true);

	} 
	@Test()
	public void logout() {
		Reporter.log("logout Method",true);
	}
}
