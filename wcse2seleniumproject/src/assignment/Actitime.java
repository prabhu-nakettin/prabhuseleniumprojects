package assignment;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://127.0.0.1:81/login.do;jsessionid=14of6d4cej1dj");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));//
		String loginofactualtittle = driver.getTitle();
		if(loginofactualtittle.equals("actiTIME - Login"))
		{
			System.out.println("login page is Verified");
		}
		else
		{
			System.out.println("login page is not verified");
		}
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		String timetrackhomepage = driver.getTitle();
		if(timetrackhomepage.equals("actiTIME - Open Tasks"))
		{
			System.out.println("login time track page verified");

		}
		else
		{
			System.out.println("login time track page is not varified");
		}
		 

















	}

}
