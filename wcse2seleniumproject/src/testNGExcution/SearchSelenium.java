package testNGExcution;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SearchSelenium {
  @Test
  public void search_for_Selinium_in_MsEdge() 
  {
	WebDriver  driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	driver.get("https://www.Google.com");
	
	driver.switchTo().activeElement().sendKeys("Selinium",Keys.ENTER);
	
	Reporter.log("Selinium",true);
	
	driver.quit();
	
  }
}
