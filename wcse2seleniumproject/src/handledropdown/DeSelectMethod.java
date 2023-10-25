package handledropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectMethod
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/User/Desktop/selenium%20file/webelement/multi.html");
		WebElement DropDown = driver.findElement(By.name("menu"));
		
		Select sel = new Select(DropDown);
		for(int i=0;i<4;i++)
		{
			sel.selectByIndex(i);
			Thread.sleep(2000);
		}
		//deselect Multiple options
		for(int i=0;i<4;i++)
		{
			sel.deselectByIndex(i);
			Thread.sleep(2000);
			
		}
		
	
	}
}

		
			
			
			
			
			
	


