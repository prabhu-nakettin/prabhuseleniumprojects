package scriptsPracticeForSelinium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenShot1
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("https://www.instagram.com");
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./Screenshot/ppp.jpg");
		
		Files.copy(source, dest);
		
		
		
		
		
		
		
		
	}

}
