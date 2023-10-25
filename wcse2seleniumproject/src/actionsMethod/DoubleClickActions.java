package actionsMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickActions 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(55));
		driver.get("http://127.0.0.1:81/login.do;jsessionid=fxv6e7xrl7l9");
		Thread.sleep(2000);

		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Login']")).click();

		Thread.sleep(2000);
		WebElement target = driver.findElement(By.xpath("//div[text()='Settings']/following-sibling::img"));
		target.click();

		Thread.sleep(2000);
		WebElement target1 = driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']"));

		Actions we = new Actions(driver);
		we.moveToElement(target1).perform();
		target1.click();

		Thread.sleep(2000);
		driver.findElement(By.id("uploadNewLogoOption")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='uploadNewLogoOption']")).click();

		Thread.sleep(2000);
		WebElement fileclick = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		we.doubleClick(fileclick).perform();












	}
}



