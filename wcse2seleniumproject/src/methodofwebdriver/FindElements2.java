package methodofwebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("iphones");
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='pcTkSc']"));
		Thread.sleep(2000);
		for(int i=0;i<options.size();i++)
		{
			WebElement opt = options.get(i);
			String iphones = opt.getText();
			System.out.println(iphones);
			Thread.sleep(2000);



		}





	}

}
