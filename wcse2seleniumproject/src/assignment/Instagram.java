package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram 
{
	public static void main(String[] args)
	{
		System.setProperty("wendriver.chrome.drover","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
		driver.get("https://www.instagram.com");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("prabhu");
		driver.findElement(By.name("password")).sendKeys("Prabhu@123");
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
	}
}
		
		
	

 
