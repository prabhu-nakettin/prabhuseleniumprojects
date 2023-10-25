package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage //annotation 
{  
	@FindBy(xpath="//a[.='Logout']")private WebElement LogoutLink;
	@FindBy(xpath="//select[@name='usersSelector.selectedUser']")private WebElement TimeTrackDropDown;
	@FindBy(xpath="//input[@id='SubmitTTButton']")private WebElement saveLeaveTime;
	@FindBy(xpath="//div[.='Users']/following-sibling::img")private WebElement userTB;
	
	
	
	//initialization
	
	public HomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}


		//Utilization
		
	public WebElement getLogoutLink() {
		return LogoutLink;
	}



	public WebElement getTimeTrackDropDown() {
		return TimeTrackDropDown;
	}



	public WebElement getSaveLeaveTime() {
		return saveLeaveTime;
	}



	public WebElement getUserTB() {
		return userTB;
	}
	
	
			//opertional Method
	
	public void logOut()
	{
		LogoutLink.click();
		
	}
	public void clickOnUsers()
	{
		if(userTB.isDisplayed())
		{
			userTB.click();
		}
		else
		{
			System.out.println("we got the Exception!!!!");
			
		}
	}	
}
