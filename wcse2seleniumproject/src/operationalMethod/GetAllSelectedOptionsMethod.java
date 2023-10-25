package operationalMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptionsMethod 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
		driver.get("file:///C:/Users/User/Desktop/selenium%20file/webelement/multi.html");
		WebElement dropdown = driver.findElement(By.name("menu"));

		Select sel = new Select(dropdown);//it will select the all given value
		for(int i=0;i<5;i++)
		{
			sel.selectByIndex(i);
		}
		List<WebElement> alloption = sel.getAllSelectedOptions();//return type <List webelelement> method 

		for(WebElement we:alloption) // for each loop it will print the value
		{
			String Options = we.getText();
			System.out.println(Options);

		}


	}

}
