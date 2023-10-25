package testNGAnnotations;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class GoogleTestCase extends BaseTest
{

	@Test
	public void x() throws InterruptedException {

		driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
		Thread.sleep(2000);
	}
	@Test
	public void y() throws InterruptedException {
		driver.switchTo().activeElement().sendKeys("sql",Keys.ENTER);
		Thread.sleep(2000);
	}
	@Test
	public void z() throws InterruptedException {
		driver.switchTo().activeElement().sendKeys("sql",Keys.ENTER);
		Thread.sleep(2000);

		
	}
	










}

