package testNgAnnotaions2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Flag8ActiTimeDataProvider   // Data provider Annotations which used to achive data driven apporoch we used here Two Dimensional Array
{

	static WebDriver driver;

	@Test(dataProvider ="actiTimeTestData")
	public void invalidLoginMethod(String usn, String pass) 
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("http://127.0.0.1:81/login.do;jsessionid=3bl79r7pica8k");

		driver.findElement(By.name("username")).sendKeys(usn);
		driver.findElement(By.name("pwd")).sendKeys(pass);
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.name("username")).clear();
	}


	@DataProvider(name="actiTimeTestData")
	public Object [][] data()
	{
		Object [][] testData=new Object [6][2];

		testData [0][0]="admin ";
		testData [0][1]=" ";

		testData [1][0]="admi@123 ";
		testData [1][1]="manager13 ";

		testData [2][0]=" ";
		testData [2][1]="manger ";

		testData [3][0]="admin1111 ";
		testData [3][1]="manager ";

		testData [4][0]="manger ";
		testData [4][1]="admin ";

		testData [5][0]="Admin#123 ";
		testData [5][1]="manger#123 ";

		return testData;

	}
}

