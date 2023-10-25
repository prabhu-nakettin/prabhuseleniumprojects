package testpackege;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import POM.HomePage;
import POM.LoginPage;
import POM.UserPage;
import genericPackege.BaseTest;
import genericPackege.Flib;
import genericPackege.IautoConstant;

public class ActiCreateManager extends BaseTest implements IautoConstant
{
	@Test
	public void createmanagerScript() throws EncryptedDocumentException, InterruptedException, IOException
	{
		LoginPage lp = new LoginPage(driver);	
		HomePage hp = new HomePage(driver);		
		UserPage up = new UserPage(driver);		
		Flib flib = new Flib();	

		lp.validLogin(flib.readPropertyData(PROP_PATH1,"username" ),flib.readPropertyData(PROP_PATH1, "password"));	
		
		hp.click_on_TaskModule();
		up.createManager_Method(flib.readExcelData(EXCEL_PATH, USER_SHEET_NAME, 1, 0),flib.readExcelData(EXCEL_PATH, USER_SHEET_NAME, 1, 1),flib.readExcelData(EXCEL_PATH, USER_SHEET_NAME, 1, 2),flib.readExcelData(EXCEL_PATH, USER_SHEET_NAME, 1,3));
		
		up.manager_Access_checkBox_method();
		
		up.delete_Manage_Method();
	}
}

	
	
	
