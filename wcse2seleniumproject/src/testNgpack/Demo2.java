package testNgpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
	@Test
	public void f() 
	{
		Reporter.log("hello");
		System.out.println("helloWorld");
	}
	@Test
	public void dm1()
	{
		int a=6;
		int b=3;
		int res=a/b;
		Reporter.log("methos name demo2"+true,res);

	}
}
