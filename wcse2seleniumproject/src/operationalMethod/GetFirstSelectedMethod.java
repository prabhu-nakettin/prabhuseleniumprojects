package operationalMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedMethod
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
		for(int i=3;i<6;i++)
		{
			sel.selectByIndex(i);
		}

		WebElement value = sel.getFirstSelectedOption();//it will select first value from starting for loop
		System.out.println(value.getText());
	} 
}








 