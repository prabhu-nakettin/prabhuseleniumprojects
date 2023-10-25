package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajiologin
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("8722525652");
		driver.findElement(By.xpath("//input[@class='login-btn']")).click();
		//driver.findElement(By.xpath("//label[@class='geaander-opt']")).click();
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("Prabhu");
		driver.findElement(By.name("email-mob")).sendKeys("prabhu@gmail.com");  
		driver.findElement(By.name("pwd")).sendKeys("Prabhu@123");
		driver.findElement(By.xpath("//span[.=' By Signing Up, I agree to ']")).click();
		driver.findElement(By.xpath("//input[@class='login-form-inputs login-btn']")).click();











	}

}
