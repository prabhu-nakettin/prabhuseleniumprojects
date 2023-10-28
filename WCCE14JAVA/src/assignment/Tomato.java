package assignment;

public class Tomato extends Vegetables
{
	String taste;
	
	Tomato(String color,String taste)
	{
		super(color);
		this.taste=taste;
		
	}
	public void eat()
	{
		System.out.println("Tomato used for praparing food or eating normally");
	}
}
