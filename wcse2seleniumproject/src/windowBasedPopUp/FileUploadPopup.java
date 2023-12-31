package windowBasedPopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions optins = new ChromeOptions();
		optins.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(optins);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://127.0.0.1:81/login.do");

		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Settings']/following-sibling::img")).click();
		WebElement target = driver.findElement(By.partialLinkText("Logo & Color Scheme"));

		Actions act = new Actions(driver);
		// mouserHover Action
		act.moveToElement(target).perform();
		target.click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='uploadNewLogoOption']")).click();

		WebElement target2 = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		//DoubleClick Action
		act.doubleClick(target2).perform();
	}
}
	





