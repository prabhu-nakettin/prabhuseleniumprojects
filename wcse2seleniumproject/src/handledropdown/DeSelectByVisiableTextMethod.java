package handledropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectByVisiableTextMethod
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
		driver.get("file:///C:/Users/User/Desktop/selenium%20file/webelement/multi.html");
		
		WebElement dropdown = driver.findElement(By.name("menu"));
		
		Select sel = new Select(dropdown);
		
		for(int i=0;i<5;i++)
		{
			sel.selectByVisibleText("idli");
			Thread.sleep(2000);
		}
		for(int i=0;i<5;i++)
		{
			sel.deselectByVisibleText("idli");
		}
		
		
	}

}
