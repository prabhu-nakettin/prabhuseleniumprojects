package genericPackege;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomeListnure extends BaseTest implements ITestListener
{

	public void onTestStart(ITestResult result) 
	{
		// TODO Auto-generated method stub
	
	}

	public void onTestSuccess(ITestResult result) 
	{
		// TODO Auto-generated method stub
	
	}
	public void onTestFailure(ITestResult result) 
	{
		String methodName = result.getMethod().getMethodName();
		  
		Reporter.log(methodName+"take Screen shot",true);
		
		try {
			failedMethod(methodName);
		} catch (IOException e) 
		{		
			e.printStackTrace();
		}	
	}

	public void onTestSkipped(ITestResult result)
	{
		
		}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		// TODO Auto-generated method stub
	
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}
		// TODO Auto-generated method stub
		

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
	}
	
}
