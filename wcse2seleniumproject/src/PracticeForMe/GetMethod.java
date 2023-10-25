package PracticeForMe;

import org.apache.poi.ss.formula.ThreeDEval;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetMethod // instagram login page
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");// it is used to handle IO Exception
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize(); 
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("prabhu");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("@12345");
		driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
		

	
		
		



	}

}
