package methodofwebdriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPositionOfBrowser
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();// method chaining method 
		Thread.sleep(2000);
		driver.get("https://www.facebook.com");
		Point targetPosition = new Point(350,350);
		driver.manage().window().setPosition(targetPosition);




	}

}
