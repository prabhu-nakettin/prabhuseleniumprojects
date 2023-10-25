import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenShotWay5 
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(55));
		
		driver.get("https://www.instagram.com/");
		
		//explicit type casting way 5

		 TakesScreenshot ts = (TakesScreenshot)driver;//
		 
		 File src = ts.getScreenshotAs(OutputType.FILE);//it comes from google pakage
		 
		 File dest = new File("./Screenshot/way05.jpg");
		 
		 Files.copy(src, dest);
		
		
		
	}

}
