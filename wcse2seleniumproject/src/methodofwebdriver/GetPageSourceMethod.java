package methodofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();// maximize the window
		driver.get("https://www.instagram.com/");// it will lunch the application 
		String sourceCodeOfloginpage=driver.getPageSource();//it will give the result source code page
		System.out.println(sourceCodeOfloginpage);
	}
}
