package testNgFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4DepensOnMethods 
{	//if in Case we are not useing depends on method it will only print on only alphabetically
	// depends on method  we will pass value inside the method it will give the first prority that method   

	@Test
	public void login()
	{
		Reporter.log("login in!!"); 
	}

	@Test(dependsOnMethods ="logout")
	public void createuser() {
		Reporter.log("usercreated");

	}

	@Test//(dependsOnMethods ="login")
	public void logout() {
		Reporter.log("Logged out");
	}
}





