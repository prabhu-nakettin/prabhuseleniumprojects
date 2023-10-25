package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IrctcXpath 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		
		ChromeOptions	options = new ChromeOptions();// It is used handled the webApplication Notification PopUp
		options.addArguments("--disable-notifications");
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(55));
		
		driver.get("https://www.irctc.co.in/nget/train-search");

		driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c57-8 ui-inputtext ui-widget ui-state-')]")).sendKeys("PUNE JN - PUNE");
		//driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c57-8 ui-inputtext ui-widget ui-state-defa')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c57-9 ui-inputtext ui-widget ui-st')]")).sendKeys("VIJAYAPURA - BJP");
		//driver.findElement(By.xpath("//span[text()='VIJAYAPURA - BJP']")).click();
		Thread.sleep(2000);

		//driver.findElement(By.xpath("//label[.='DD/MM/YYYY *']")).click();
		//driver.findElement(By.xpath("//a[.='13']")).click();
		//Thread.sleep(2000);

		driver.findElement(By.xpath("//div[contains(@class,'ng-tns-c65-11 ui-dropdown ui-widget ui-stat')]")).click();
		driver.findElement(By.xpath("//span[.='AC 2 Tier (2A)']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[contains(@class,'ng-tns-c65-12 ui-dropdown ui-widget ')]")).click();
		driver.findElement(By.xpath("//span[.='TATKAL']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//label[.='Flexible With Date']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'search_btn train_Search')]")).click();










	}

}
