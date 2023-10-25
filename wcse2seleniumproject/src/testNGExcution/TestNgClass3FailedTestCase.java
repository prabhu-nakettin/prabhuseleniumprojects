package testNGExcution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgClass3FailedTestCase {
  @Test
  public void method5() 
  {
	  Reporter.log("Method5",true);
  }
  @Test
  public void method6()
  {
	  Reporter.log("method6",true);
  }
}
