package testNgAnnotaions2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotains_Flags 
{
	@Test
	public void method_Test_Annotaions1() 
	{
		Reporter.log("TestAnnotains1",true);

	}
	@Test
	public void method_Test_Annotaions2() 
	{
		Reporter.log("TestAnnotains2",true);

	}
	@BeforeMethod
	public void before_Method_Annotains() 
	{
		Reporter.log("befor Method Annotains",true);
	}
	@AfterMethod
	public void after_Method_Annotaons() {
		Reporter.log("After Method Annotaons",true);

	}
	@BeforeClass
	public void before_class_annotations() {
		Reporter.log("Before class Annotaions",true);  
	}
	@AfterClass
	public void after_class_Annotaions()
	{
		Reporter.log("after class Annotaoins",true);
	}
	@BeforeTest
	public void before_test_Annotations() {
		Reporter.log("Before Test Anotaions",true);
	}
	@AfterTest
	public void After_Test_Annotains()
	{
		Reporter.log("AfterTest Annotations",true);
	}
	@BeforeSuite
	public void Before_Suite_Annotations()
	{
		Reporter.log("Before Suite Annotations",true);

	}
	@AfterSuite
	public void After_Suite_Annotaions()
	{
		Reporter.log("After Suite Annotaions",true);
	}
}



