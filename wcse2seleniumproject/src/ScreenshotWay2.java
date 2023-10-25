import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenshotWay2 
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.flipkart.com/");
		
	//way 2 downcost into Remote Webdriver (class)
		
		RemoteWebDriver rw = (RemoteWebDriver)driver;
		
		File src = rw.getScreenshotAs(OutputType.FILE);
		
		File tst = new File("./Screenshot/prabhuWay2.png");
		
		Files.copy(src, tst);
		

		
		
	}

}
