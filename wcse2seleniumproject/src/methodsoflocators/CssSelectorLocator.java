package methodsoflocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hotstar.com/in/subscribe/sign-in?returnURL=/in/subscribe/my-account");
		driver.findElement(By.cssSelector("input[id='phoneNo']")).sendKeys("8722525652");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[class='submit-button']")).click();
		
		
		
		
	}

}
