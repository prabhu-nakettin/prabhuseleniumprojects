package oops;

public class Dog extends Animal
{
	String colorOfEyes;


	Dog(String bread,float weight,String color,String colorOfEyes)
	{
		super(bread, weight,color);
		
		this.colorOfEyes=colorOfEyes;

	}
	public void barking()
	{
		System.out.println("bow bow");

	}
	public static void main(String[] args) 
	{
		Dog d=new Dog("",45,"brown","");
		System.out.println(d.color);
		System.out.println(d.colorOfEyes);
		System.out.println(d.weight);

	}
}