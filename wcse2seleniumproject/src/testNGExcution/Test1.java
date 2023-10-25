package testNGExcution;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Test1 extends BaseTest
{
	@Test
	public void Search1() {
		
		driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
		
	}
	
}
 