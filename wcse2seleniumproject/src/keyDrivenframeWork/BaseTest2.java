package keyDrivenframeWork;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest2 extends Flib2
{
	static WebDriver driver;

	public void openBrowser() throws IOException
	{	
		// read data the from property file to get the browser value and url
		
		Flib2 flib = new Flib2();
		
		String browservalue = flib.readPropertyData(PROP_PATH,"browser");
		String url = flib.readPropertyData(PROP_PATH,"url");

		if(browservalue.equalsIgnoreCase("chrome"))
		{
			
			driver=new ChromeDriver();
			
		}
		else if(browservalue.equalsIgnoreCase("firefox"))
		{
			
			driver=new FirefoxDriver();
			
		}
		else if(browservalue.equalsIgnoreCase("edge"))
		{	
			
			driver=new EdgeDriver();
			
		}
		else
		{	
			System.out.println("Enter valid browser value");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		
	}
	public void closeBrowser() 
	{
		driver.quit();
	}
	
}
		



