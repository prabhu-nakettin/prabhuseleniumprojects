package testNgAnnotaions2;

import org.bouncycastle.jcajce.provider.symmetric.ARC4.Base;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class GoogleTestCaseSearch extends BaseTest
{
	
  @Test
  public void search_for_Java() 
  {
	  driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
  }
  @Test
  public void search_for_Selinium()
  {
	  driver.switchTo().activeElement().sendKeys("selinium",Keys.ENTER);
  }
}

