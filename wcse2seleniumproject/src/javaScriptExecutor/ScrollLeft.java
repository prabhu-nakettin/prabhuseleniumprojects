package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.devtools.idealized.Javascript;

public class ScrollLeft 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(-5000,0)");
		
		
		
		
		

	
}
}
