package dataDrivenFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActiTimeInvalidTestCase
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");

		WebDriver driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://127.0.0.1:81/login.do;jsessionid=c8hgm5fe8klmr");
		
		Flib flib = new Flib();
		
		int rc = flib.rowcount("./data/ActiTimeTestCase.xlsx", "invalid");
		
		for(int i=1;i<=rc;i++)
		 {
			
		String invalidusername = flib.readExcelData("./data/ActiTimeTestCase.xlsx", "invalid", i, 0);
		String invalidpassword = flib.readExcelData("./data/ActiTimeTestCase.xlsx", "invalid", i, 1);
		
		driver.findElement(By.name("username")).sendKeys(invalidusername);
		driver.findElement(By.name("pwd")).sendKeys(invalidpassword);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).clear();
		}
	}

}
