package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeA
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.youtube.com/");
		driver.findElement(By.name("search_query")).sendKeys("shorts");
		Thread.sleep(2000);
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(2000);
		List<WebElement> shortvideo= driver.findElements(By.xpath("//span[@class='style-scope ytd-reel-item-renderer']"));

		List<WebElement> shortvideos = driver.findElements(By.xpath("//span[@class='style-scope ytd-reel-item-renderer']/ancestor::a[@class='yt-simple-endpoint style-scope ytd-reel-item-renderer']/descendant::span[@class='inline-metadata-item style-scope ytd-video-meta-block']"));
		for(int i=0;i<shortvideo.size();i++)
		{
			String video =shortvideo.get(i).getText();

			for(int j=i;j<=i;i++)
			{
				String abc = shortvideos.get(j).getText();
				System.out.println(video+" :"+ abc);
				Thread.sleep(2000);
				
			}






		}






	}

}
