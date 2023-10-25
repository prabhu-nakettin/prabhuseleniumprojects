package popUpHandle;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopUp 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		driver.get("file:///C:/Users/User/Desktop/selenium%20file/webelement/ConfirmationPopup.html");

		driver.findElement(By.tagName("input")).click();

		//Swith controls to confirmation popup

		Alert al = driver.switchTo().alert();

		Thread.sleep(2000);
		//al.accept();//1st method

		//al.dismiss();//2nd Method 

		//System.out.println(al.getText());//3rd Method

		al.sendKeys("aaa");//4th Method








	}

}
