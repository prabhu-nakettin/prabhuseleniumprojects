package getWindowHandle;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Qn5 
{
	public static void main(String[] args) throws InterruptedException 
	{
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
		
		Set<String> child = driver.getWindowHandles();
		
		for(String ch:child)
		{
			driver.switchTo().window(ch).manage().window().maximize();
			
			if(!parent.equals(ch))
			{	
				Thread.sleep(2000);
				driver.switchTo().window(ch).close();
			}
			
		}
			
		

	}

}
