 package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage  // pom is a java Design pattern
						// object Repositiry or WebElemnet Repositiry
{
	@FindBy(xpath="//input[@value='Create New User']")private WebElement createNewUserButton;
	@FindBy(name="username")private WebElement userNameTB;
	@FindBy(name="passwordText")private WebElement passTB;
	@FindBy(name="passwordTextRetype")private WebElement retypePassTB;
	@FindBy(name="firstName")private WebElement firstNameTB;
	@FindBy(name="lastName")private WebElement lastNameTB;
	@FindBy(xpath="//input[@value='   Create User   ']")private WebElement CreateButton;
	@FindBy(name="phone")private WebElement phoneNumberTB;

	////intalize the value
	

	public UserPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);// initElements which  used to initalize @findby annotations

	}

	//// Getter method

	
	public WebElement getCreateNewUserButton() {
		return createNewUserButton;
	}

	public WebElement getUserNameTB() {
		return userNameTB;
	}

	public WebElement getPassTB() {
		return passTB;
	}

	public WebElement getRetypePassTB() {
		return retypePassTB;
	}

	public WebElement getFirstNameTB() {
		return firstNameTB;
	 }

	public WebElement getLastNameTB() {
		return lastNameTB;
	}

	public WebElement getCreateButton() {
		return CreateButton;
	}

	public WebElement getPhoneNumberTB() {
		return phoneNumberTB;
	}
	public void userCreate()
	{
		createNewUserButton.click();
	}


	public void firstUser(String prabhu, String pass,String aaa ,String xyz,String hello) throws InterruptedException
	{
		userNameTB.sendKeys(prabhu);
		Thread.sleep(2000);
		passTB.sendKeys(pass);
		Thread.sleep(2000);
		retypePassTB.sendKeys(pass);
		Thread.sleep(2000);
		firstNameTB.sendKeys(aaa);
		Thread.sleep(2000);
		lastNameTB.sendKeys(xyz);
		Thread.sleep(2000);
		phoneNumberTB.sendKeys(hello);
		Thread.sleep(2000);
		CreateButton.click();







	}



}
