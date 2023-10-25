package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericPackege.WorkLib;

public class UserPage 
{	
	@FindBy(xpath = "//div[.='Users']/ancestor::a")private WebElement User_module;
	@FindBy(xpath = "//input[@value='Create New User']")private WebElement create_new_user_Button;
	@FindBy(name =  "username")private WebElement userName_TB;
	@FindBy(name = "firstName")private WebElement firstName_TB;
	@FindBy(name = "lastName")private WebElement lastName_TB;
	//@FindBy(name = "email")private WebElement emailTB;
	@FindBy(name = "passwordText")private WebElement passwordText_TB;
	@FindBy(name = "passwordTextRetype")private WebElement passwordTextRetype_TB;
	@FindBy(name = "phone")private WebElement phone_TB;
	@FindBy(name = "rightGranted[9]")private WebElement enterTimeTrack_checkBox;
	@FindBy(name = "rightGranted[12]")private WebElement Modify_TimeTrack_ofOtherUsers_CheckBox;
	@FindBy(name = "rightGranted[2]")private WebElement Manage_Customers_and_Projects_CheckBox;
	@FindBy(name = "rightGranted[13]")private WebElement Manage_Tasks_CheckBox;
	@FindBy(name = "rightGranted[5]")private WebElement Manage_Users_Check_Box;
	@FindBy(name ="rightGranted[7]")private WebElement Manage_Billing_Types_Check_Box;
	@FindBy(name = "rightGranted[10]")private WebElement ManageWork_Schedule_Check_Box;
	@FindBy(name = "rightGranted[11]")private WebElement Manage_General_Settings_Check_Box;
	@FindBy(xpath = "//input[@value='   Create User   ']")private WebElement create_User_Button;
	@FindBy(xpath = "(//td[@class='listtblcell']/a)[2]")private WebElement userList_Link;
	@FindBy(xpath = "//input[@value='Delete This User']")private WebElement Delete_User_Button;
	
	
	
	// INITALIZATION
	public UserPage(WebDriver  driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Utilization
	public WebElement getUser_module() {
		return User_module;
	}


	public WebElement getCreate_new_user_Button() {
		return create_new_user_Button;
	}


	public WebElement getUserName_TB() {
		return userName_TB;
	}


	public WebElement getFirstName_TB() {
		return firstName_TB;
	}


	public WebElement getLastName_TB() {
		return lastName_TB;
	}


	//public WebElement getEmailTB() {
		//return emailTB;
	//}


	public WebElement getPasswordText_TB() {
		return passwordText_TB;
	}


	public WebElement getPasswordTextRetype_TB() {
		return passwordTextRetype_TB;
	}


	public WebElement getPhone_TB() {
		return phone_TB;
	}


	public WebElement getEnterTimeTrack_checkBox() {
		return enterTimeTrack_checkBox;
	}


	public WebElement getModify_TimeTrack_ofOtherUsers_CheckBox() {
		return Modify_TimeTrack_ofOtherUsers_CheckBox;
	}


	public WebElement getManage_Customers_and_Projects_CheckBox() {
		return Manage_Customers_and_Projects_CheckBox;
	}


	public WebElement getManage_Tasks_CheckBox() {
		return Manage_Tasks_CheckBox;
	}


	public WebElement getManage_Users_Check_Box() {
		return Manage_Users_Check_Box;
	}


	public WebElement getManage_Billing_Types_Check_Box() {
		return Manage_Billing_Types_Check_Box;
	}


	public WebElement getManageWork_Schedule_Check_Box() {
		return ManageWork_Schedule_Check_Box;
	}


	public WebElement getManage_General_Settings_Check_Box() {
		return Manage_General_Settings_Check_Box;
	}


	public WebElement getCreate_User_Button() {
		return create_User_Button;
	}


	public WebElement getUserList_Link() {
		return userList_Link;
	}


	public WebElement getDelete_User_Button() {
		return Delete_User_Button;
	}


	//oprational
	
	public void createManager_Method(String username,String firstName,String lastName,String password1)
	{
		create_new_user_Button.click();
		userName_TB.sendKeys(username);
		firstName_TB.sendKeys(firstName);
		lastName_TB.sendKeys(lastName);
		//emailTB.sendKeys(Email);
		passwordText_TB.sendKeys(password1);
		passwordTextRetype_TB.sendKeys(password1);
		
	}
	public void manager_Access_checkBox_method()
	{
		enterTimeTrack_checkBox.click();
		Modify_TimeTrack_ofOtherUsers_CheckBox.click();
		Manage_Customers_and_Projects_CheckBox.click();
		Manage_Tasks_CheckBox.click();
		Manage_Users_Check_Box.click();
		Manage_Billing_Types_Check_Box.click();
		ManageWork_Schedule_Check_Box.click();
		Manage_General_Settings_Check_Box.click();
		create_User_Button.click();		
	}	
	public void delete_Manage_Method()
	{
		userList_Link.click();
		Delete_User_Button.click();
		
		
		WorkLib wb = new WorkLib();
		wb.handleConfirmation_PopUp();
	}	
}


	