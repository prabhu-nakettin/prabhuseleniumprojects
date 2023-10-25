package testNgFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag3Priority
{
  @Test(priority =3)
  public void login()
  {
	  Reporter.log("login in!!"); 
  }
  
  @Test(priority = 1)
public void createUser() {
	  Reporter.log("usercreated");
	
}
  
  @Test(priority = 2)
  public void logOut() {
	  Reporter.log("Logged out");
	  
  }
}
