package testNgDyanamicScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import net.bytebuddy.dynamic.NexusAccessor.InitializationAppender;
import scriptsPracticeForSelinium.TakeScreenShot1;

public class BaseTest {


	static WebDriver driver;
	public void initialization()
	{
		System.setProperty("webdriver.chrome.driver.","./drivers/chromedriver");

		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");

		driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://127.0.0.1:81/login.do;jsessionid=b3hnihi5bli8l");

	}	
	public void failedMethod(String methodName)
	{
		try
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			File srs = ts.getScreenshotAs(OutputType.FILE);
			File dst = new File("./Screenshot/"+methodName+".png");
			Files.copy(srs, dst);
		}
		catch(Exception e)
		{

		}
	}
	public void close()
	{
		driver.quit();
	}

}





