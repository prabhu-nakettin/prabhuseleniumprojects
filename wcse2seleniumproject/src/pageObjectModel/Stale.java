package pageObjectModel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Stale 
{
	static WebDriver driver;// Generalished the code
	
	public static void main(String[] args) throws InterruptedException 
	{		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1:81/login.do");
		
	
		WebElement usn = driver.findElement(By.name("username"));
		usn.sendKeys("admin");
		
		System.out.println(usn);
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.findElement(By.name("username")).sendKeys("admin");
		System.out.println(usn);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);		
		
	}
}
