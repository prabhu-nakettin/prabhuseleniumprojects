package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://127.0.0.1:81/login.do;jsessionid=bihei8qj4mc2");
		
		WebElement chr = driver.findElement(By.name("username"));
		System.out.println(chr.getText());

		WebElement ps = driver.findElement(By.name("pwd"));
		System.out.println(ps.getText());
		
	
	








	}

}
