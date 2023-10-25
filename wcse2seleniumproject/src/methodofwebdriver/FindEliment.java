package methodofwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindEliment
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User/Desktop/selenium%20file/webelement/CheckBox.html");
		Thread.sleep(2000);
		WebElement automation = driver.findElement(By.name("n4"));
		System.out.println(automation);
		automation.click();
		Thread.sleep(2000);
		





	}

}
