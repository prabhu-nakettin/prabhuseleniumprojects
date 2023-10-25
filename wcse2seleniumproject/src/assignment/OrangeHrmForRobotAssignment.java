package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHrmForRobotAssignment//wrong script
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		WebElement Target = driver.findElement(By.xpath("//p[text()='Username : Admin']"));
		
		Actions me = new Actions(driver);
		me.doubleClick(Target).perform();
		
		Thread.sleep(2000);
		WebElement target2 = driver.findElement(By.xpath("//p[text()='Password : admin123']"));
		
		me.doubleClick(target2).perform();
		
		
		
	}

}
