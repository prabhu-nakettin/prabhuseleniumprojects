package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedWebElement//webelement find properly in webpage then it will give the answar true special for checkbox realated oterwise false 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:81/login.do;jsessionid=ppb5adat9vpt");
		WebElement name = driver.findElement(By.name("remember"));
		boolean result = name.isSelected();
		System.out.println(result);																																		
		Thread.sleep(2000);
		
		name.click();
		boolean result2 = name.isSelected();//it will give the answar Boolean value true or false  
		System.out.println(result2);
		
		
		
}
	

}
