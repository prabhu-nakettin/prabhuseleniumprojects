package methodofwebdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeOfBrowser 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(3000);
		Dimension targetSize = new Dimension(800,500);//it is interface and dememsion is higt and widght
		driver.manage().window().setSize(targetSize);//tagetSize is veriable for dimesion return type is void 
		driver.close();
		driver.quit();


	}


}
