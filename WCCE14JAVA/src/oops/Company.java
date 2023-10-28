package oops;

public class Company //get Method  
{
	int eId;
	String name;
	private double salary;
	
	Company(int eID,String name, double salary)
	{
		this.eId=eID; 
		this.name= name;
		this.salary=salary;
	}
	// for useing  getter method
	
	public double getSalary()
	{
		return this.salary;
	}
	
	

}
