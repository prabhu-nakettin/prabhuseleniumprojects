package assignment;

public class Employee2 extends Employee
{
	String Promotion2;

	Employee2(String Promotion,String Promotion2)
	{
		super(Promotion);
		this.Promotion=Promotion;
	}
	public void conveyWishes()
	{
		System.out.println("we are happy for your promotion");
	}

}
