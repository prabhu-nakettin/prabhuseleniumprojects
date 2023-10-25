package POM2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjectModel.Flib;

public class BaseTest extends POM2.Flib
{
	static WebDriver driver;

	public void openBrowser() throws IOException
	{
		Flib flib = new Flib();
		String browserValue = flib.readPropertyData(PROP_PATH, "browser");
		String url = flib.readPropertyData(PROP_PATH, "url");

		if(browserValue.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();			
		}

		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();		
		}

		else if(browserValue.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else 
		{
			System.out.println("enter valid browser Value!!!");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get(url);

	}

	public void CloseBrowser()
	{
		driver.quit();
	}

}



