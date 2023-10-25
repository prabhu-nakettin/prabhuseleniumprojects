 package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage //this is page object Repository
{
	@FindBy(xpath="//input[@name='username']")private WebElement usnTB;
	@FindBy(xpath="//input[@name='pwd']")private WebElement passTB;
	@FindBy(xpath="//a[@id='loginButton']")private WebElement loginButton;
	@FindBy(xpath="//input[@name='remember']")private WebElement checkBox;


	// Constructor useing for intiallize the values 

	public LoginPage(WebDriver driver)//webdriver it is a interface we will upcasting then driver it is a predefined veriable
	{ 
		// pageFactoryit is class and initElments it is class
		
		PageFactory.initElements(driver, this);// this keyword it will give the current addresss of current webelement
	}


	////only getter method are used here// which is used to retrive the values 


	public WebElement getUsnTB() {
		return usnTB;
	}


	public WebElement getPassTB() {
		return passTB;
	}


	public WebElement getLoginButton() {
		return loginButton;
	}


	public WebElement getCheckBox() {
		return checkBox;
	}


	// operational methods method overloading method 


	public void validLogin(String validUsn,String validpass)
	{
		usnTB.sendKeys(validUsn);
		passTB.sendKeys(validpass);
		loginButton.click();
	}

	public void invalidLogin(String invalidusn,String invalidass) throws InterruptedException
	{
		usnTB.sendKeys(invalidusn);
		passTB.sendKeys(invalidass);
		loginButton.click();
		Thread.sleep(2000);
		usnTB.clear();
	}
}


