package getWindowHandle;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetWindowHandle 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions optins = new ChromeOptions();
		optins.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(optins);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://omayo.blogspot.com/");

		String parenthandle = driver.getWindowHandle();
		System.out.println("this is the parent window add:"+parenthandle);

		driver.findElement(By.linkText("Open a popup window")).click();

		Set<String> handle1 = driver.getWindowHandles();//it is used to get the address of 
		for(String wh:handle1)
		{
			System.out.println("Chinld hamdle:"+wh);
		}





	}

}
