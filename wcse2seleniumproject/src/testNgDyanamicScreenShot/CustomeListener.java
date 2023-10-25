package testNgDyanamicScreenShot;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomeListener extends BaseTest implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {

		Reporter.log("test is  start",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("test is Success",true);

	}

	@Override
	public void onTestFailure(ITestResult result) {

		String failedMethod = result.getMethod().getMethodName();
		Reporter.log("this is the failed method"+failedMethod+"Screenshot is taken",true);
		failedMethod(failedMethod);
		

	}

	@Override
	public void onTestSkipped(ITestResult result) {


	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {


	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

		Reporter.log("this is faliled method",true);
	}

	@Override
	public void onStart(ITestContext context) {
		
		
		Reporter.log("@test annotaions Start execution!!!",true);
	}


	@Override
	public void onFinish(ITestContext context) {
	}


		
}
