package methodsoflocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator2
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Forgot password?']")).click(); //Syntax of  text path 
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[.='Forgotten password?']")).click();//functional text path 
		// it is a Relative Text path it used  identify the webeliment in webpage   
		Thread.sleep(2000);
		



	}

}
