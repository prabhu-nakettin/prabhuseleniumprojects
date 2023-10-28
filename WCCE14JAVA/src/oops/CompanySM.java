package oops;

public class CompanySM
{
	int eid;
	String name;
	private double salary;

	CompanySM(int eid,String name,double salary)
	{
		this.eid=eid;
		this.name=name;
		this.salary=salary;		
	}
	public double getSalary()
	{ 
		return this.salary;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
}
