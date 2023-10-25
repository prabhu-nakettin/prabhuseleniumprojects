package synchronaization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicityWait 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
		
		driver.get("https://www.flipkart.com");
		
		driver.findElement(By.xpath("//button[.='✕']")).click();
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("Slippers",Keys.ENTER);
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("laptop",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		
		WebDriverWait ew = new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement hp = driver.findElement(By.xpath("//div[text()='HP']"));
		ew.until(ExpectedConditions.elementToBeClickable(hp)).click();
		
		
	
		
		
		
		
	}

}
