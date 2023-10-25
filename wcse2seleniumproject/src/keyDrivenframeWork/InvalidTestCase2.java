package keyDrivenframeWork;

import java.io.IOException;

import org.openqa.selenium.By;

public class InvalidTestCase2  extends  BaseTest2 implements IAutoConstant
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		BaseTest2 bt = new BaseTest2();
		// top open and close browser
		bt.openBrowser();
		
		Flib2 flib = new Flib2();
		
		int rc = flib.rowcount(EXCEL_PATH, "invalid");
		
		for(int i=1;i<=rc;i++)
		{
			driver.findElement(By.name("username")).sendKeys(flib.readExcelData(EXCEL_PATH, "invalid", 1, 0));
			
			driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData(EXCEL_PATH, "invalid", 1, 1));
			
			driver.findElement(By.id("loginButton")).click();
			
			driver.findElement(By.name("username")).clear();
		}
		
		bt.closeBrowser();
		
		

		 
		
		
		//read invalid username	and password from actitimetesdta excel file		

	}
}

