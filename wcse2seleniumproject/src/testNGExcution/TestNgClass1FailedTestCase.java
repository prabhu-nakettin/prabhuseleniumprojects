package testNGExcution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgClass1FailedTestCase {
  @Test
  public void method1() 
  {
	  Reporter.log("method1",true);
  }
  @Test
  public void method2()
  {
	  int n=10;
	  int res=n/2;
	  
	  Reporter.log("method2",true);
  }
}
