package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisabledWebElement
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("file:///C:/Users/User/Desktop/selenium%20file/webelement/DisableWebElement.html");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		Thread.sleep(2000);
		//jse.executeScript("document.getElementById('i1').value='admin'");
		jse.executeScript("document.getElementById('i1').value='prabhu'");
		
		// my own Implemention
		
		driver.navigate().to("https://www.facebook.com/");
		
		jse.executeScript("document.getElementById('email').value='Prabhu@123'");
		

	}

}
