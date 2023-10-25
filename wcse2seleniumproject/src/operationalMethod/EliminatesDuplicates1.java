package operationalMethod;

import java.time.Duration;
import java.util.HashSet;
import java.util. List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminatesDuplicates1 
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

		HashSet<String> we = new HashSet<String>();//it will not Accept duplicate values hashset it is used to remove the duplicates values

		//get the list of Webelement

		List<WebElement> ab = sel.getOptions();

		//read the list &Get the text

		for(int i=0;i<ab.size();i++)
		{
			WebElement option = ab.get(i);
			String text = option.getText();

			//add the text to set so that duplicates wan't be accepted and				
			//insertion order is not maintioned

			we.add(text);

		}
		//read the set
		
		for(String value:we)//for each loop
		{
			System.out.println(value);
		}







	}

}
