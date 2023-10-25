package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=laptop&sid=6bo%2Cb5g&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_3_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_3_na_na_na&as-pos=1&as-type=RECENT&suggestionId=laptop%7CLaptops&requestId=28c5b24d-4198-4f41-894c-7e28c30104fa&as-searchtext=lap&p%5B%5D=facets.rating%255B%255D%3D3%25E2%2598%2585%2B%2526%2Babove&p%5B%5D=facets.brand%255B%255D%3DHP&p%5B%5D=facets.processor%255B%255D%3DCore%2Bi5&p%5B%5D=facets.operating_system%255B%255D%3DWindows%2B10");
		driver.findElement(By.xpath("//div[.='HP']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[.='Core i5']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[.='Windows 10']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[contains(@class,'_3sckoD')]")).click();
		Thread.sleep(2000);

		
		 

	}
}





