package assignment;

import java.awt.Frame;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.grid.Main;

public class BlueStonePopUp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();// it is used to handle the hidden division Pop Up
		Thread.sleep(2000);
		
		//Switch the Controls to Frame 
		WebElement frameelement = driver.findElement(By.id("fc_widget"));// it is the inside WebElement path
		driver.switchTo().frame(frameelement); // it is the method for frame element 
		
		Thread.sleep(2000);
		WebElement Ftm = driver.findElement(By.xpath("//div[@class='d-hotline h-btn animated zoomIn faster eager-load    ']"));
		Ftm.click();
		
		driver.switchTo().parentFrame();// it is used to close the child of  webpage
		
		WebElement name = driver.findElement(By.xpath("//input[@id='chat-fc-name']"));
		name.sendKeys("prabhu");

		Thread.sleep(2000);
		WebElement emil = driver.findElement(By.xpath("//input[@id='chat-fc-email']"));
		emil.sendKeys("Prabhu13@gmail.com");
		
		





	}

}
