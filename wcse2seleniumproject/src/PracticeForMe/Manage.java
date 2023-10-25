package PracticeForMe;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

//import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Manage 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome,driver","./drivers/chromedriver.exe");

		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");

		WebDriver driver=new ChromeDriver(op);
		driver.manage().window().maximize();

		driver.get("https://flipkart.com");
		Thread.sleep(2000);

		Dimension targetsize = new Dimension(500, 500);
		driver.manage().window().setSize(targetsize);
		Thread.sleep(2000);
		
		Point TargetPosition = new Point(100,100);
		driver.manage().window().setPosition(TargetPosition); 
		


	}

}
