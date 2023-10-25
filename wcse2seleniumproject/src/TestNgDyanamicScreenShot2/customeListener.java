package TestNgDyanamicScreenShot2;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class customeListener extends BaseTest implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) 
	{
		Reporter.log("",true);
		
	}

	@Override
	public void onTestSuccess(ITestResult result)
	{
		String fm = result.getMethod().getMethodName();
		
		Reporter.log("",true);
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		String failedMethod = result.getMethod().getMethodName();
		Reporter.log("methid Failed and  Taken ScreenShot",true);
		screemShot_of_FailedMethod(failedMethod);
		
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
	
		Reporter.log("",true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		Reporter.log("",true);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result)
	{
		Reporter.log("",true);
		
	}

	@Override
	public void onStart(ITestContext context) 
	{
		Reporter.log("",true);
		
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		Reporter.log("",true);
		
	} 
	
}
 
