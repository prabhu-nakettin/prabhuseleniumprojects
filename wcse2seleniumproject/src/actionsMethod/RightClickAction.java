package actionsMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(55));
		driver.get("https://www.selenium.dev/downloads/");
		
		WebElement sel = driver.findElement(By.xpath("//h1[text()='Downloads']"));
		//to perform Right click
		
		Actions we = new Actions(driver);
		we.contextClick(sel).perform(); 
		
		
		
	}

}
