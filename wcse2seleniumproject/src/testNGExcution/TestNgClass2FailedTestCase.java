package testNGExcution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgClass2FailedTestCase 
{
  @Test
  public void method3() 
  {
	  Reporter.log("method3",true);
	  
  }
  @Test
  public void method4()
  {
	  Reporter.log("Method4",true);
  }
}
