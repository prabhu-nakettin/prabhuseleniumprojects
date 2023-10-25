package actionsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMethod 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/drag_drop.html");

		WebElement sel = driver.findElement(By.xpath("//a[text()=' BANK ']"));

		WebElement target = driver.findElement(By.xpath("//li[@class='placeholder']/ancestor::ol[@id='bank']"));

		Actions act = new Actions(driver);
		act.dragAndDrop(sel, target).perform();

		WebElement we = driver.findElement(By.xpath("//a[text()=' 5000']"));

		WebElement target2 = driver.findElement(By.xpath("(//li[@class='placeholder']/ancestor::div[@class='ui-widget-content'])[1]"));

		act.dragAndDrop(we, target2).perform();


	}

}
