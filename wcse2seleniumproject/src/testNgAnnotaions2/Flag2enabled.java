 package testNgAnnotaions2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2enabled 
{

	@Test(description = "performs Login",enabled = true)  // enabled which used to enabled or disable the method return type is boolean
	public void Method1()
	{
		Reporter.log("method1",true);		

	}
	@Test(description = "performs Create user",enabled = false)  //
	public void Method2() 
	{
		Reporter.log("method2",true); 
	}
	@Test(description = "perform logout")
	public void Method3() 
	{
		Reporter.log("method3",true);
	}
}

