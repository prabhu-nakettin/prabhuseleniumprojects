package assertionTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class Assertion1
{
  @Test
  public void validLogin() 
  {
	    Reporter.log("lunch the browser",true);
	    Reporter.log("lunch the web app by useing url",true);
	    
	    
	    SoftAssert sa = new SoftAssert();//SoftAssertion it will useing only for Non Critical Featurs //soft assert
	    sa.assertEquals(true, false);
	    Reporter.log("login page will be displayed!!",true);
	    Reporter.log("perform the login operation!!",true);
	    Assert.assertEquals(false, false);// hard assert//Critical Featurs
	    Reporter.log("home page will be display!!",true);
	    Reporter.log("log out",true);
	    
	    
	    
	    
  }
}
