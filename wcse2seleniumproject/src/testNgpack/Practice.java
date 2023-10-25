package testNgpack;

import org.checkerframework.common.util.report.qual.ReportCall;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Practice {
	@Test
	public void 	Demo() 
	{
		Reporter.log("hi",true);
	}
	@Test
	public void Demo1()
	{
		Reporter.log("hellow",true);
	}
	@Test
	public void Demo2() {
		Reporter.log("jai");
	}
}


