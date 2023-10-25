package testNGExcution;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SearchJava {
  @Test
  public void search_in_java_Chorme()
  {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	 
	 driver.get("https://www.Google.com");
	 
	 driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
	 
	 Reporter.log("java",true);
	 
	 driver.quit();
  }
}
