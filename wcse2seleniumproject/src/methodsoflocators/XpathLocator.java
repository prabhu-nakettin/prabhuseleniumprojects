package methodsoflocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathLocator
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.firefox.driver","./drivers/firefoxdriver.exe");
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		// Illlegal expection it is java EXception Chr
		//session not created it is a seleinium expection
		//WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nike.com/in/member/profile/login?continueUrl=https://www.nike.com/in/");
		driver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys("prabhubankettin@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("93426701");
		driver.findElement(By.xpath("//input[@value='SIGN IN']")).click();
		Thread.sleep(2000);




	}

}
