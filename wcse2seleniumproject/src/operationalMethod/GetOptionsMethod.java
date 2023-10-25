package operationalMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsMethod
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
		driver.get("file:///C:/Users/User/Desktop/selenium%20file/chromedriver_win32%20(2)/webelement/Dropdown.html");
		 
		//single dropdown
		WebElement singledropdown = driver.findElement(By.id("i1"));
		 
		 Select option = new Select(singledropdown);
		 option.getOptions();
		 Thread.sleep(2000);
		 System.out.println(option.getOptions());
		 
		 
		// Multidropdown
		 
		 driver.navigate().to("file:///C:/Users/User/Desktop/selenium%20file/chromedriver_win32%20(2)/webelement/multi.html");
		 WebElement dropdown1 = driver.findElement(By.name("menu"));
		 
		 Select opt = new Select(dropdown1);
		 
		 opt.getOptions();
		 Thread.sleep(2000);
		 System.out.println();
		 
		 
		 
		
		 
		 
		 
		
		
	}

}
