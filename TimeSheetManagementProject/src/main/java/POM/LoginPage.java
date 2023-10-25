package POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	
	@FindBy(xpath="//input[@name='username']")private WebElement usnTB;
	@FindBy(xpath ="//input[@name='pwd']")private WebElement passTB;
	@FindBy(xpath = "//input[@name='remember']")private WebElement checkBox;
	@FindBy(xpath = "//a[@id='loginButton']")private WebElement loginButton;
	
	// Initalization 
	
	
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}

	
	// Utilization
	
	public WebElement getUsnTB() {
		return usnTB;
	}

	public WebElement getPassTB() {
		return passTB;
	}	

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	// operational
	
	public void validLogin(String validusername,String validpassword) throws InterruptedException
	{
		usnTB.sendKeys(validusername);
		passTB.sendKeys(validpassword);
		Thread.sleep(2000);
		loginButton.click();
	}	
	public void invalidLogin(String invalidusername,String invalidpasswowrd) throws InterruptedException
	{
		usnTB.sendKeys(invalidusername);
		passTB.sendKeys(invalidpasswowrd);
		loginButton.click();
		Thread.sleep(2000);
		usnTB.clear();				
	}	

}
