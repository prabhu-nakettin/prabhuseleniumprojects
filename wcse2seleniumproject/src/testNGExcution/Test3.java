package testNGExcution;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Test3 extends BaseTest
{
  @Test
  public void Search3() {
	  
	  driver.switchTo().activeElement().sendKeys("selinium",Keys.ENTER);
	  
	  
  }
}
