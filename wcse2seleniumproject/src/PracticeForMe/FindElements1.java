package PracticeForMe;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElements1 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");

		WebDriver driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='SDkEP']"));
		//driver.switchTo().activeElement().click();
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("Redmi mobiles");
		Thread.sleep(2000);
		
		for(WebElement opt:options)
		{
		
			String iphone = opt.getText();
			
			System.out.println(iphone);
			Thread.sleep(2000);
		}
	}

}



