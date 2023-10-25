package POM2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
	@FindBy(xpath="//div[.='Time-Track']/ancestor::a")private WebElement timeTrack;
	@FindBy(xpath="//div[.='Tasks']/ancestor::a")private WebElement tasksModule;
	@FindBy(xpath="//div[.='Reports']/ancestor::a")private WebElement reportsModule;
	@FindBy(xpath = "//div[.='Users']/ancestor::a")private WebElement user_Module;
	@FindBy(xpath = "//div[.='Work Schedule']/ancestor::a")private WebElement workScheduleModule;
	@FindBy(xpath = "//div[.='Settings']/ancestor::a")private WebElement settingModule;
	@FindBy(xpath = "//a[.='Logout']")private WebElement Logout_link;



	//initalization

	public void homePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Utilization

	public WebElement getTimeTrack() {
		return timeTrack;
	}



	public WebElement getTasksModule() {
		return tasksModule;
	}



	public WebElement getReportsModule() {
		return reportsModule;
	}



	public WebElement getUser_Module() {
		return user_Module;
	}



	public WebElement getWorkScheduleModule() {
		return workScheduleModule;
	}



	public WebElement getSettingModule() {
		return settingModule;
	}



	public WebElement getLogout_link() {
		return Logout_link;
	}

	//operational

	public void click_on_TimeTrack_Module()
	{
		timeTrack.click();
	}
	public void click_on_TaskModule()
	{
		tasksModule.click();
	}
	public void click_on_ReportsModule()
	{
		reportsModule.click();
	}
	public void click_on_userModule()
	{
		user_Module.click();
	}
	public void click_on_WorkScheduleModule() 
	{
		workScheduleModule.click();

	}
	public void click_on_Setting_Module()
	{
		settingModule.click();
	}
	public void click_on_logout_Link()
	{
		Logout_link.click();
	}
}
