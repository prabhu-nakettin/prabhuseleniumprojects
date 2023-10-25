package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Rtp 
{
	static WebDriver driver;// iside we have to declare Multiple method and insruction 

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("select the browser which you want");
		String  browservalue= sc.next();//import statement
		if(browservalue.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");// illlegal state Exception 
			driver=new ChromeDriver();      //Create a object
			driver.manage().window().maximize();// maximize the chrome browser
		}
		else if(browservalue.equals("edge"))
		{
			System.setProperty("webdriver.msedge.driver","./drivers/msedgedriver.exe");
			driver=new EdgeDriver();
			driver.manage().window().maximize();
		}
		else
		{ 
			System.out.println("salect valid browservalue");
		} 
	}
}


