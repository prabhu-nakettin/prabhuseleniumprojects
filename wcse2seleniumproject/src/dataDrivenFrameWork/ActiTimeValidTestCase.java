package dataDrivenFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import assignment.Flipkart;

public class ActiTimeValidTestCase 
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://127.0.0.1:81/login.do;jsessionid=c8hgm5fe8klmr");

		Flib flib = new Flib();
		Thread.sleep(2000);

		driver.findElement(By.name("username")).sendKeys(flib.readExcelData("./data/ActiTimeTestCase.xlsx","valid" , 1, 0));
		driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData("./data/ActiTimeTestCase.xlsx","valid" , 1, 1));
		driver.findElement(By.id("loginButton")).click();







	}

}
