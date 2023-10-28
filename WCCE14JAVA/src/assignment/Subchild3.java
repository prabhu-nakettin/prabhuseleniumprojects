package assignment;

import abstrac.Child1;

public class Subchild3 extends Child1
{
	String location;
	
	Subchild3(int rollNo,String name,int marks,String address,String location)
	{
		super();
		this.location=location;
	}
	public static void main(String[] args) 
	{
		Subchild3 s=new Subchild3(1, "prabhu", 80, "vjp","karnataka");
				 
	}
}
