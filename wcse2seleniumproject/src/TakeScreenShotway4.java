import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class TakeScreenShotway4 
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(55));

		driver.get("https://www.simplilearn.com/tutorials/git-tutorial/what-is-github");

		//way 04 create thr 0bj of EventfiringWebdriver

		EventFiringWebDriver evt= new EventFiringWebDriver(driver);//third party class 

		File src = evt.getScreenshotAs(OutputType.FILE);//file it is a interface

		File dest = new File("./Screenshot/wayno4.jpg");

		Files.copy(src, dest);//copy it is method



	}

}
