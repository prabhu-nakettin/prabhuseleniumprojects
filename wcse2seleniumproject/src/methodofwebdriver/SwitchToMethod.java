package methodofwebdriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethod 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.switchTo().activeElement().sendKeys("Java",Keys.ENTER);
		//driver.get("https://www.google.com");
		driver.navigate().to("https://www.google.com");
		
		
		
		
		
		
	}

}
