package keyDrivenframeWork;

import java.io.IOException;

import org.openqa.selenium.By;

public class ValidLoginTestCase2  extends BaseTest2 implements IAutoConstant
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		// to open the close the broser
		
		BaseTest2 bt = new BaseTest2();
		
		bt.openBrowser();
		
		Flib2 flib = new Flib2();
		
		driver.findElement(By.name("username")).sendKeys(flib.readPropertyData(PROP_PATH, "username"));
		
		driver.findElement(By.name("pwd")).sendKeys(flib.readPropertyData(PROP_PATH, "password"));
		
		driver.findElement(By.id("loginButton")).click();
	
		driver.quit();
	}

}
