package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ActiTimeWebElementClear
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		driver.get("http://127.0.0.1:81/login.do;jsessionid=bihei8qj4mc2");
		WebElement chr = driver.findElement(By.name("username"));
		chr.sendKeys("admin");
		//Thread.sleep(2000);

		WebElement ps = driver.findElement(By.name("pwd"));
		ps.sendKeys("manager");
		//Thread.sleep(2000);

		chr.clear();
		//Thread.sleep(2000);
		
		ps.clear();
		//Thread.sleep(2000);
		










	}

}
