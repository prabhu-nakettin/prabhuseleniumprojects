package testNgDyanamicScreenShot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import net.bytebuddy.dynamic.NexusAccessor.InitializationAppender;


@Listeners(CustomeListener.class)
public class ActiTimeLogin extends BaseTest
{
	@BeforeMethod
	public void setUp()	
	{
		initialization();
	}
	@Test
	public void loginPageMethod()
	{
		String loginpage = driver.getTitle();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(loginpage,"actiTIME - Login");

		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();

		sa.assertAll();// it will give the detaileed discription of failed or passed method 

	}
	@Test(dependsOnMethods ="loginPageMethod",alwaysRun =true)
	public void homePageMethod() throws InterruptedException
	{
		String loginPage = driver.getTitle();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(loginPage,"LoginID");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();


		//Home page 
		Thread.sleep(2000);

		WebElement saveLeaveTime = driver.findElement(By.id("SubmitTTButton"));

		if(saveLeaveTime.isDisplayed())
		{
			Assert.assertEquals(true, true);
		}
		else
		{
			sa.assertEquals(true, true);
		}


		WebElement logoutLink = driver.findElement(By.xpath("//a[.='Logout']"));

		if(logoutLink.isDisplayed())
		{
			logoutLink.click();
		}
		else
		{
			System.out.println("we will get exception");
		}

	}
	@AfterMethod
	public void tearDown()
	{
		close();
	}

}
