package assertionTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion2ActitimeTestCase 
{
	static WebDriver driver;


	@BeforeMethod
	public void loginBrowser()
	{ 
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:81/login.do;jsessionid=7e52a46nfd3am");		  
	}
	@Test
	public void login() throws InterruptedException 
	{
		String actualloginpagetittle = driver.getTitle();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualloginpagetittle,"loginPage");

		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);

		String actualhomepagetittle = driver.getTitle();
		Assert.assertEquals(actualhomepagetittle,actualhomepagetittle );
		driver.findElement(By.className("logout")).click();
		Thread.sleep(2000);
		sa.assertAll();

	}
	@AfterMethod
	public void logout()
	{
		driver.quit();
	}


}


