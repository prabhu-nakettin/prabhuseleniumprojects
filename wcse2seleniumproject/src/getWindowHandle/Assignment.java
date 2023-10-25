package getWindowHandle;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Q1) how to close all browser
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions optins = new ChromeOptions();
		optins.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(optins);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.linkText("Open a popup window")).click();
		Thread.sleep(2002);
		driver.quit();

	
		
		
		
		
		
		
		
		
	}

}
