package POM2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleClass // old Addresss 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("");
		
		WebElement usnTB = driver.findElement(By.name("username"));
		usnTB.sendKeys("admin");
		
		WebElement pwdTB = driver.findElement(By.name("pwd"));// Stale is means is old
		pwdTB.sendKeys("admin123");	
		
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);	
		usnTB.clear();
		
		
		
	}
	

}
