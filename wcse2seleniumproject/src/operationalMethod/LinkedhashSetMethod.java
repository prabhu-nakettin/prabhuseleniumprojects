package operationalMethod;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LinkedhashSetMethod 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
		driver.get("file:///C:/Users/User/Desktop/selenium%20file/webelement/multi.html");

		WebElement dropdown = driver.findElement(By.id("i1"));

		Select sel = new Select(dropdown);

		List<WebElement> ab = sel.getOptions();
		for(int i=0;i<ab.size();i++)
		{

			WebElement me = ab.get(i);
			String value = me.getText();
			System.out.println(value);

		}
		LinkedHashSet<String> we = new LinkedHashSet<String>();
			
		



	}

}
