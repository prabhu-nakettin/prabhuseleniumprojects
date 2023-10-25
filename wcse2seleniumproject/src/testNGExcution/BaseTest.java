package testNGExcution;

import java.sql.Driver;
import java.time.Duration;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {

	static WebDriver driver;

	@BeforeTest
	public void xpath() {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}

	@BeforeMethod
	public void setUp() {

		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com");


	}
	@AfterMethod
	public void tearDown() {

		driver.quit();

	}
}
