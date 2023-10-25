package synchronaization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkrtSyncro 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome,driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(55));
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
		driver.findElement(By.xpath("//span[.='Login']")).click();






	}

}
