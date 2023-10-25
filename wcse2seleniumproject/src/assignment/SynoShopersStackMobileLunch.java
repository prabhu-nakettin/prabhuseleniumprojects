package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynoShopersStackMobileLunch
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome,driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Thread.sleep(2000);
		driver.get("https://shoppersstack.com/");
		WebElement mobile = driver.findElement(By.xpath("//div[@class='featuredProducts_cardBody__l4gLE']/descendant::img[@alt='APPLE iPhone 14 Pro']"));
		mobile.click();
		WebElement cover = driver.findElement(By.xpath("//input[@id='Check Delivery']"));
		cover.sendKeys("586101");
		WebDriverWait checkbox = new WebDriverWait(driver, Duration.ofSeconds(50));
		WebElement box = driver.findElement(By.xpath("//button[@id='Check']"));
		checkbox.until(ExpectedConditions.elementToBeClickable(box)).click();
		





	}


}
