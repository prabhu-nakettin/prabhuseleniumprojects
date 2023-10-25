package PracticeForMe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetCurrentUrl 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		
		WebDriver	driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.get("https://www.amezon.com");
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.facebook.com");
		driver.navigate().back();
		driver.navigate().forward();
		//driver.navigate().equals(driver);
		String currenUrl = driver.getCurrentUrl();
		System.out.println(currenUrl);
		driver.close();
		
		}

}
