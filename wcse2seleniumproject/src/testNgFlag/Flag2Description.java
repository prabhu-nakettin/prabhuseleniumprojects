package testNgFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2Description				
{
	@Test(description = "Login page")
	public void search1() 
	{
		Reporter.log("this is FTC");
	}
	@Test(description = "modul 01")
	public void search2() 
	{
		Reporter.log("this is INT");
	}
}



