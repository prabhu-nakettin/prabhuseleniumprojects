package testpackege;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import POM.LoginPage;
import genericPackege.BaseTest;
import genericPackege.Flib;
import genericPackege.IautoConstant;

public class InvalidTestCaseActitime extends BaseTest implements IautoConstant
{
	@Test
	public void invalidScript() throws InterruptedException, EncryptedDocumentException, IOException
	{
		LoginPage lp = new LoginPage(driver);
		
		Flib flib = new Flib();
		
		int rc = flib.lastRowCount(EXCEL_PATH, INVALID_SHEET_NAME);
		
		for(int i=1;i<=rc;i++)
		{
			lp.invalidLogin(flib.readExcelData(EXCEL_PATH,INVALID_SHEET_NAME, i, 0),flib.readExcelData(EXCEL_PATH, INVALID_SHEET_NAME, i, 1));
		}				
	}		
}
