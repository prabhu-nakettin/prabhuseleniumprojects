package TestNgDyanamicScreenShot2;

import java.util.jar.Attributes.Name;

import org.bouncycastle.jcajce.provider.symmetric.ARC4.Base;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase extends BaseTest
{
  @Test(dependsOnGroups = "")
  public void loginMethod() 
  {
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals(driver.getTitle(),"prabhu");
	  
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  driver.findElement(By.id("loginButton")).click();
	  Reporter.log("Reporter Done",true);
	  
	  sa.assertAll();
	  
	  
  }
  
  @Test(dependsOnGroups ="loginMethod")
  public void creteUser()
  {
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  driver.findElement(By.id("loginButton")).click();
	  
	  Reporter.log("user created is done ",true);
	  	  
  }
  
  @Test(dependsOnGroups ="creteUser",alwaysRun = true)
  public void logoutMethod()
  {
	  Reporter.log("logoutMethod is Done");
  } 
}
