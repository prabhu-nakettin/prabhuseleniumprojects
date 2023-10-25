package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynoShoppersStack1
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://shoppersstack.com/");
		

		WebElement santor = driver.findElement(By.xpath("//div[@class='featuredProducts_cardBody__MDlEh']/descendant::img[@alt='Santoor']"));
		santor.click();
		driver.findElement(By.xpath("//input[@id='Check Delivery']")).sendKeys("8722555");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement Button = driver.findElement(By.xpath("//button[.='Check']"));
		wait.until(ExpectedConditions.elementToBeClickable(Button)).click();














	}

}
