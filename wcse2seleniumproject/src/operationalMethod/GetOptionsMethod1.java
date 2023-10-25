package operationalMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsMethod1
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
		driver.get("file:///C:/Users/User/Desktop/selenium%20file/chromedriver_win32%20(2)/webelement/Dropdown.html");

		WebElement singledropdown = driver.findElement(By.id("i1"));

		Select option = new Select(singledropdown);



		// Multidropdown

		//driver.navigate().to("file:///C:/Users/User/Desktop/selenium%20file/chromedriver_win32%20(2)/webelement/multi.html");

		//without using Selection  Method select the option from dropDown

		//WebElement multi1 = driver.findElement(By.id("menu"));

		List<WebElement> allops = option.getOptions();

		for(WebElement ab:allops)
		{
			if(ab.getText().equals("poha"))
			{
				ab.click();
				break;
			}
		}








	}
}
