package getScreenShotMethods;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotway01 
{
	public static void main(String[] args) throws IOException, InterruptedException
	{

		// way 1 create of browser Specfic classes into same class

		
		ChromeDriver driver = new ChromeDriver();//
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		
		driver.get("https://www.instagram.com");
		
		Thread.sleep(2000);
		
		File src = driver.getScreenshotAs(OutputType.FILE);

		File dst = new File("./screenshot/ssWay1.jpg");

		Files.copy(src, dst);
	
		driver.quit();

	}

}
