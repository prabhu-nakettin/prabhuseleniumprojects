package testNgAnnotaions2;

import org.testng.Assert;
import org.testng.annotations.Test;



public class TestNg7_Assert 
{
	@Test(description = "perform login")  // it will deepend on create_user_Method   
	  public void loginMethod()
	  {
		  System.out.println("it is use to perform login");
	  }

	  @Test(description = "perform user Created",dependsOnMethods = "loginMethod")//so we have used to dependon methos here 
	 
	  public void create_user_Method() 
	  {
		  Assert.fail();  //this  flag which is used to fail this method
		  System.out.println("user is Craeted");
	  }
	 
	 
	  @Test(description = "perform logout",dependsOnMethods ="create_user_Method",alwaysRun= true)// it will print last // dependsOnMethods ="create_user_Method it wil prinyt 2 position
	  public void logoutMethod() 
	  {
		  System.out.println("it is used to perform logout");
	  }
	  
	
 
}
