package keyDrivenframeWork;
import java.io.IOException;
import org.openqa.selenium.By;
public class ActiTimeInvalidTestCase extends BaseTest
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		BaseTest bt = new BaseTest();
		bt.setUp();

		Flib flib = new Flib();

		int rc = flib.rowcount(EXCEL_PATH,"invalid");

		for (int i=1;i<=rc;i++)
		{
			String invalidusn = flib.readexcelData(EXCEL_PATH, "invalid", i, 0);
			String invalidpass = flib.readexcelData(EXCEL_PATH, "invalid", i, 1);

			driver.findElement(By.name("username")).sendKeys(invalidusn);
			driver.findElement(By.name("pwd")).sendKeys(invalidpass);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();

		}
		bt.tearDown();
	}

}
