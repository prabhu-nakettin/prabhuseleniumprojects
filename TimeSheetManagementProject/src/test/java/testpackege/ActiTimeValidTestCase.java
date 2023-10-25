package testpackege;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import POM.LoginPage;
import genericPackege.BaseTest;
import genericPackege.Flib;

public class ActiTimeValidTestCase extends BaseTest
{
	@Test
	public void validLoginScript() throws EncryptedDocumentException, InterruptedException, IOException
	{
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();		
		lp.validLogin(flib.readPropertyData(PROP_PATH1,"username"),flib.readPropertyData(PROP_PATH1, "password"));
	}	
}


