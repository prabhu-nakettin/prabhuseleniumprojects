package testNGAnnotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Test1{

	@BeforeTest
	public void beforeTest() {
		Reporter.log("before test",true);

	}
	@AfterTest
	public void afterTest()
	{
		Reporter.log("after test ",true);
	}

	@BeforeClass
	public void beforeClass() 
	{
		Reporter.log("before class",true);

	}

	@AfterClass
	public void afterClass() {
		Reporter.log("after class",true);

	}

	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("before suite",true);
	}

	@AfterSuite
	public void afterSuite() {
		Reporter.log("before suite",true);
	}
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("before Method",true);
	}
	
	@Test
	public void f() {
	}
	@Test
	public void g() {

	}
	@Test 
	public void h() {

	}
	@AfterMethod
	public void afterMethod() {
		Reporter.log("after method",true);
	}





}
