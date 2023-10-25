package operationalMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElementMethod //we can use list of WebElemnt in for loop or for each loop//but Webelement we 
{
	public static void main(String[] args) //can use normal object creation 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
		driver.get("file:///C:/Users/User/Desktop/selenium%20file/webelement/multi.html");
		WebElement dropdown = driver.findElement(By.name("menu"));

		Select sel = new Select(dropdown);
		
		WebElement value = sel.getWrappedElement();// it is used to print all the dropdown elements
		String me = value.getText();
		System.out.println(me);
		
	}

}
