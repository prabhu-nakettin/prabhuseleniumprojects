package oops;

public class Apple extends Fruit
{
	String type;
	double price;
	
	Apple(String color,String taste,String type,double price)
	{
		super(color, taste);
		this.type=type;
		this.price=price;
	}
	public void use()
	{
		System.out.println("healty fruit");
	}
	public static void main(String[] args) 
	{
		Apple b= new Apple("red", "sweet", "kas", 500.99);
		System.out.println(b.color);
		
		
	}
}
