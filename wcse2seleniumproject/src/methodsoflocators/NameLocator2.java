package methodsoflocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User/Desktop/selenium%20file/webelement/CheckBox.html");
		driver.findElement(By.name("n1")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("n2")).click();
		driver.findElement(By.name("n3")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("n4")).click();
		Thread.sleep(2500);
		
		
		
		
		
		
		
	}

}
