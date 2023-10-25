package POM2;

import java.io.IOException;

public class ValidLoginTestCase extends BaseTest
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		Thread.sleep(2000);
	
		//perform valid Login Operation
		// refer the webElements from LoginPage pom

		LoginPage lp = new LoginPage(driver);

		Flib flib = new Flib();
		
		lp.validLogin(flib.readPropertyData(PROP_PATH,"username"),flib.readPropertyData(PROP_PATH, "password"));
		
		Thread.sleep(2000);
		
		bt.CloseBrowser();
	}
}
