package synchronaization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeExplicitlySyn
{
	public static void main(String[] args)//it si used to all method
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		
		WebDriver driver= new ChromeDriver(op);
		driver.manage().window().maximize();

		driver.get("http://127.0.0.1:81/login.do;jsessionid=14of6d4cej1dj");

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(35));
		wait.until(ExpectedConditions.titleContains("actiTIME - Login"));

		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();

	}
}

