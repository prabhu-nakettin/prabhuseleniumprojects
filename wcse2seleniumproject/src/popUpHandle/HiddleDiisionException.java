package popUpHandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class HiddleDiisionException
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.msedge.driver","./drivers/msedgedriver.exe");

		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		driver.get("https://www.flipkart.com/");
		
		// to handle the Hidden Division Pop Up 
		driver.findElement(By.xpath("//button[.='✕']")).click();
		
		
		
		
	}
}

