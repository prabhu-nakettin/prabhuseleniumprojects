package TestNgAssertion2;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ActitimeAssertion {


	static WebDriver driver;
	@Test
	public void loginmethod() 
	{


		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("http://127.0.0.1:81/login.do");

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getTitle(),"Tittle");  // Soft Assert


		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();

		// i need use here tittle of web Webpage

		String tittlehp = "actiTIME - Enter Time-Track";
		Assert.assertEquals(driver.getTitle(),tittlehp);
			
		WebElement logout = driver.findElement(By.partialLinkText("Logout"));
			
		Assert.assertEquals(logout.isDisplayed(),true);  // hard Assert

		logout.click();
		
		sa.assertAll();
	}
}
