package oops;

public class Company2// get method
{
	public static void main(String[] args)
	{
		Company emp=new Company(1561377, "Prabhu", 100000);
		System.out.println(emp.eId);
		System.out.println(emp.name);
		System.out.println(emp.getSalary());// in this line we are useing private keyword thats why we use method name  
	}
		
		

}
