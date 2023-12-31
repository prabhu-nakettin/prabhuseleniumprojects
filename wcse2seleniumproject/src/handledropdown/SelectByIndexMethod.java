package handledropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndexMethod
{
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/User/Desktop/selenium%20file/webelement/Dropdown.html");
		
		WebElement dropdown = driver.findElement(By.id("i1"));
		
		Select sel = new Select(dropdown);
		Thread.sleep(2000);
		
		sel.selectByIndex(4);
		
	}
}


