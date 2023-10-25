package testNgAnnotaions2;

import org.testng.annotations.Test;

public class Flag4priority // if prority is not there it will alphabeticaly
{
	@Test(priority =0) // 2 number it will print zero also lesser it will higher visibility 
	public void f() 
	{
		System.out.println("f");
	}
	@Test(priority =5) //it will print 7 position 
	public void g() 
	{
		System.out.println("g");
	}
	@Test(priority =7) //it will print 8 position 
	public void h() 
	{
		System.out.println("h");
	}
	@Test(priority =7) //it will print 9 position 
	public void i()
	{
		System.out.println("i");
	}
	@Test(priority =9)//it will print 10 position 
	public void j() 
	{
		System.out.println("j");
	}
	@Test(priority =2) //it will print 5 position 
	public void k() 
	{
		System.out.println("k");
	}
	@Test(priority =4) //it will print 6 position
	public void q()
	{
		System.out.println("q");
	}
	@Test
	public void z() // it will print 3 position
	{
		System.out.println("z");
	}
	@Test(priority =-1)	// -1 it is lesser but it is higher visibility //1 position
	public void p()
	{
		System.out.println("p");
	}
	@Test(priority =1)  //it will print 4 position 
	public void o()
	{
		System.out.println("o");
	}
}

