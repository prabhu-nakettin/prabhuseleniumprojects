package oops;

public class Laptop extends ElectronicDevice  //upcasting program 
{

	String brand;
	String input1;

	Laptop(String input,String name,String brand,String input1)
	{
		super(input, name);
		this.brand=brand;
		this.input1=input1;
	}

	public static void main(String[] args)
	{
		ElectronicDevice p= new Laptop("charging", "Electronic Device", "Apple", "Dc Current");// this upcasting program 
		System.out.println(p.name);
		System.out.println(p.input);
		//System.out.println(p.brand);
		//System.out.println(p.input1);


	}
}

