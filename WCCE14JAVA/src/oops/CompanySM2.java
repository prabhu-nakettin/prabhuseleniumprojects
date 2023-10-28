package oops;

public class CompanySM2 
{
	public static void main(String[] args) 
	{
		CompanySM emp1=new CompanySM(1561377,"prabhu",100000);
		CompanySM emp2=new CompanySM(1561366, "ABC",50000);
		
		System.out.println(emp1.name);
		System.out.println(emp1.getSalary());
		emp1.setSalary(150000);
		System.out.println("increment salary"+emp1.getSalary());
		
		System.out.println(emp2.name);
		System.out.println(emp2.getSalary());
		emp2.setSalary(80000);
		System.out.println("increment salary"+emp2.getSalary());
	}

	
}
