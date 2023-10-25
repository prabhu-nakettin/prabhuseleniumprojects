package testNgAnnotaions2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1description 
{
  @Test(description = "performs Login")  // 	description flag it is used to describe methods 
  public void Method1()
  {
	  Reporter.log("method1",true);
	  
  }
  @Test(description = "performs Create user")  //description flag it is used to describe methods
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
