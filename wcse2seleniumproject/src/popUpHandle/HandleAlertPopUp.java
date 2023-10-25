package popUpHandle;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertPopUp
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("file:///C:/Users/User/Desktop/selenium%20file/webelement/AlertPopUp.html");
		
		//Generate the Alert popup
		
		driver.findElement(By.xpath("//button[.='click me!']")).click();
		
		//Swith the controls the Alert pop up
		
		Alert al = driver.switchTo().alert();
		Thread.sleep(2000);
		//Accept Popup 
		//al.accept(); // this is the first method
		
		// Dismiss the Alert popup
		//al.dismiss();
		
		//Print the Text of Alert POP UP
		
		//System.out.println(al.getText());
		
		//charactistics of sendkeys popup
		
		al.sendKeys("hello there");
		
		
		
		
		
		
		
		
		
		
	}

}
