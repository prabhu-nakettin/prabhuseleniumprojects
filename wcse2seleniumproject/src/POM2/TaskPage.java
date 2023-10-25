package POM2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TaskPage 
{
	//it is used to store all webElement of taskpage
 
	@FindBy(xpath = "//a[.='Projects & Customers']")private WebDriver ProjectsCustomersButton;
	@FindBy(xpath ="//input[@value='Create New Customer']")private WebElement createNewCustomerButton;
	@FindBy(xpath = "//input[@value='Create New Project']")private WebElement createNewProjectButton;
	@FindBy(name = "name")private WebElement customernameDroDdown;
	@FindBy(name = "createCustomerSubmit")private WebElement createCustomerBtton;
	@FindBy(xpath = "//select[@name='customerId']")private WebElement customer_Dropdown; 
	@FindBy(name ="name")private WebElement projectNameDropdown;
	@FindBy(name ="createProjectSubmit")private WebElement createProjectSubmitButton;
	
	//Getter method
	
	public WebDriver getProjectsCustomersButton() {
		return ProjectsCustomersButton;
	}
	public WebElement getCreateNewCustomerButton() {
		return createNewCustomerButton;
	}
	public WebElement getCreateNewProjectButton() {
		return createNewProjectButton;
	}
	public WebElement getCustomernameDroDdown() {
		return customernameDroDdown;
	}
	public WebElement getCreateCustomerBtton() {
		return createCustomerBtton;
	}
	public WebElement getCustomer_Dropdown() {
		return customer_Dropdown;
	}
	public WebElement getProjectNameDropdown() {
		return projectNameDropdown;
	}
	public WebElement getCreateProjectSubmitButton() {
		return createProjectSubmitButton;
	} 
	
	
	
	
	
	
}
