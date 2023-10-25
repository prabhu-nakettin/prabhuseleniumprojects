package getWindowHandle;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class QN2 
{
	public static void main(String[] args) throws InterruptedException
	{
		//how to close all the window without Quit method
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions optins = new ChromeOptions();
		optins.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(optins);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://omayo.blogspot.com/");
		
		String parent = driver.getWindowHandle();
	
		driver.findElement(By.linkText("Open a popup window")).click();
		Thread.sleep(2002);
		
		Set<String> allwindow = driver.getWindowHandles();
		for(String wh:allwindow)
		driver.switchTo().window(wh).close();
		
		
		
		
		
	}

}
