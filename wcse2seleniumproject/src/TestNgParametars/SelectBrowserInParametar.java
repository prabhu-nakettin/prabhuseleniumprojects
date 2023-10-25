package TestNgParametars;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import qsp.FireFoxBrowse;

public class SelectBrowserInParametar 
{
	static WebDriver driver;
	
	@Parameters({"Browser","Url","Validusername","Validpassword"})
	
	@Test
	public void selct_Browser_Method(String browservlue,String url,String usn,String pass) throws InterruptedException 
	{
		if(browservlue.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browservlue.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			Reporter.log("Enter valid BrowserValue value",true);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get(url);
		
		driver.findElement(By.name("username")).sendKeys(usn);
		driver.findElement(By.name("pwd")).sendKeys(pass);
		driver.findElement(By.id("loginButton")).click();

		Thread.sleep(2000);
		
		driver.quit();
	}
}
