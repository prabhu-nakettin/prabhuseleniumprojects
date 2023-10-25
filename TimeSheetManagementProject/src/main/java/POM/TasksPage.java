package POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TasksPage
{
	//it is used to store all webElement of taskpage

	@FindBy(xpath="//a[.='Projects & Customers']")private WebElement ProjectsCustomerSub_module;
	@FindBy(xpath = "//input[@value='Create New Customer']")private WebElement createNewcustomerButton;
	@FindBy(xpath ="//input[@value='Create New Project']")private WebElement createNewProjectButton;
	@FindBy(name =   "name")private WebElement customerNameTB;
	@FindBy(name="createCustomerSubmit")private WebElement createCustomer_Button;
	//@FindBy(name = "electedCustomer")private WebElement customer_DropDown;
	@FindBy(name="name")private WebElement project_Name_TB;
	@FindBy(name = "createProjectSubmit")private WebElement createProject_Button;
	@FindBy(name = "customerId")private WebElement ProjectCustonmer_DropDown;
	@FindBy(partialLinkText ="All")private WebElement select_All_CheckBox;
	@FindBy(xpath ="//input[@value='Delete Selected']")private WebElement Delete_CheckBox_Button;
	@FindBy(id = "deleteButton")private WebElement Delete_PopupButton;


	// Initalzation

	public TasksPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}


	// Utilization

	public WebElement getProjectsCustomerSum_module() {
		return ProjectsCustomerSub_module;
	}

	public WebElement getCreateNewcustomerButton() {
		return createNewcustomerButton;
	}

	public WebElement getCreateNewProjectButton() {
		return createNewProjectButton;
	}

	public WebElement getCustomerNameTB() {
		return customerNameTB;
	}

	public WebElement getCreateCustomer_Button() {
		return createCustomer_Button;
	}

	public WebElement getProject_Name_TB() {
		return project_Name_TB;
	}

	public WebElement getCreateProject_Button() {
		return createProject_Button;
	}

	public WebElement getProjectCustonmer_DropDown() {
		return ProjectCustonmer_DropDown;
	}

	public WebElement getSelect_All_CheckBox() {
		return select_All_CheckBox;
	}

	public WebElement getDelete_CheckBox_Button() {
		return Delete_CheckBox_Button;
	}

	public WebElement getDelete_PopupButton() {
		return Delete_PopupButton;
	}

	// operational Method
	
	public void create_New_User(String CustomerName)
	{
		ProjectsCustomerSub_module.click();
		createNewcustomerButton.click();
		customerNameTB.sendKeys(CustomerName);
		createCustomer_Button.click();
	}

	public void create_new_Project(String customerName,String projectName)
	{
		ProjectsCustomerSub_module.click();
		Select sel = new Select(ProjectCustonmer_DropDown);
		sel.selectByVisibleText(customerName);
		project_Name_TB.sendKeys(projectName);
		createProject_Button.click();
	}


	public void deleteCustomer_ProjectMethod()
	{
		select_All_CheckBox.click();
		Delete_CheckBox_Button.click();
		Delete_PopupButton.click();
		
	}
}












