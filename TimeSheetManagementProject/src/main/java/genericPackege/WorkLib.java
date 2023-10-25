package genericPackege;

public class WorkLib extends BaseTest
{
	public void handleConfirmation_PopUp()
	{
		driver.switchTo().alert().accept();
	}

}
