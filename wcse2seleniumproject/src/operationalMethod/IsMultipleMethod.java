package operationalMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
		driver.get("file:///C:/Users/User/Desktop/selenium%20file/chromedriver_win32%20(2)/webelement/Dropdown.html");
		 WebElement singledropdown = driver.findElement(By.id("i1"));
		 
		 Select sel = new Select(singledropdown);
		 
		 sel.isMultiple();//it will give the answer true or false boolean(// we can't use ismultiple method in single dropdown 
		 System.out.println(sel.isMultiple());// if in case used it wiil give the Result  only false:
		 Thread.sleep(2000);
		 
		 //Multiple Method// we can use ismultiple method in only multiple drop down
		 
		 driver.navigate().to("file:///C:/Users/User/Desktop/selenium%20file/chromedriver_win32%20(2)/webelement/multi.html");
		 WebElement dropdown1 = driver.findElement(By.name("menu"));
		 
		 Select sel1 = new Select(dropdown1);
		 
		 sel.isMultiple();
		 System.out.println(sel1.isMultiple());
		 Thread.sleep(2000);
		 
		
	}

}
