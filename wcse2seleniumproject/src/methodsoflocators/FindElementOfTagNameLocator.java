package methodsoflocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementOfTagNameLocator
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/User/Desktop/selenium%20file/webelement/username.html");
		Thread.sleep(2000);
		driver.navigate().to("file:///C:/Users/User/Desktop/selenium%20file/webelement/Dropdown.html");
		
		driver.findElement(By.tagName("input")).sendKeys("admin");
		Thread.sleep(2000);
		






	}

}
