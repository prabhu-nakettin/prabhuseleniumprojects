package getWindowHandles;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FlipkartAssignment 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions optins = new ChromeOptions();
		optins.addArguments("--remote-allow-origins=*");
		optins.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(optins);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("//button[.='✕']")).click();

		driver.findElement(By.name("q")).sendKeys("ihones");

		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();

		//String parent = driver.getWindowHandle();
		//driver.switchTo().frame(parent);

		WebElement clicktextofphone = driver.findElement(By.xpath("//div[.='APPLE iPhone 14 (Starlight, 128 GB)']"));	
		clicktextofphone.click();
		Thread.sleep(2000);

		Set<String> child = driver.getWindowHandles();
		for(String ch:child)
		{
			driver.switchTo().window(ch).manage().window().maximize();
		}

		//driver.switchTo().parentFrame();
		//Thread.sleep(2000);
		Thread.sleep(2000);
		WebElement ab = driver.findElement(By.xpath("//a[@class='_1fGeJ5 PP89tw']"));
		ab.click();
		
		Thread.sleep(2000);
		WebElement color = driver.findElement(By.xpath("//div[@class='_2C41yO']/ancestor::li[@id='swatch-0-color']"));
		color.click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("pincodeInputId")).sendKeys("586101");
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@class='_2P_LDn']")).click();
		
		WebElement Frame = driver.findElement(By.xpath("//iframe[@class='_1JqCrR']"));//iframe rec
		Frame.click();
		driver.switchTo().frame(Frame);
		
		Thread.sleep(2000);
		WebElement video = driver.findElement(By.xpath("//div[@class='_3g-Cpg']/ancestor::div[@class='_1AuMiq P9aMAP']"));
		video.click();

		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		WebElement videoclick = driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']"));
		videoclick.click();

	}





}
