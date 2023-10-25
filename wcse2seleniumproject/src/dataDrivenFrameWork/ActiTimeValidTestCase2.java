package dataDrivenFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeValidTestCase2 extends Flib2 implements IautoConstant  // for practice purpose
{
	static WebDriver driver;
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://127.0.0.1:81/login.do;jsessionid=5n8cr2sqn3mt3");
		
		Flib2 flib2 = new Flib2();
		
		driver.findElement(By.name("username")).sendKeys(flib2.readExcelData(EXCEL_PATH,"valid", 1, 0));
		driver.findElement(By.name("pwd")).sendKeys(flib2.readExcelData(EXCEL_PATH,"valid", 1, 1));
		driver.findElement(By.id("loginButton")).click();
		
		
		
	}

}
