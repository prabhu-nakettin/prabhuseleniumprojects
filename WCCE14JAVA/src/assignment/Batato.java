package assignment;

public class Batato extends Vegetables
{
	String color;
	
	Batato(String color,String taste,String color1)
	{
		super(color);
		this.color=color1;
	}
	
	public void sabji()
	{
		System.out.println("Battato which is used for preparing Subji");
	}
	
	public static void main(String[] args) 
	{
		Batato b=new Batato("Any color","Sour","white");
		//b.prapareForFood();
		System.out.println(b.color);
		Vegetables a= b;
		System.out.println(a.color);
		Tomato t=(Tomato)a;
		System.out.println(t.taste);	
	}
}
