package oops;

public class BullDog extends Dog
{
	String smellingSence;
	String power;


	BullDog(String bread,float weight,String color,String colorOfEyes,String smellingSence,String power)
	{
		super(bread, weight, color, colorOfEyes);
		this.smellingSence=smellingSence;
		this.power=power;
		
	}
	public void agregation()
	{
		System.out.println("BullDog agregation is very high comparing to other Dog");
	}
	public static void main(String[] args) 
	{
		
		BullDog b=new BullDog("xyz", 50, "black", "Black&white","good","highPower");
		System.out.println(b.bread);
		System.out.println(b.color);
		System.out.println(b.colorOfEyes);
		System.out.println(b.power);
		System.out.println(b.weight);
		System.out.println(b.smellingSence);
	}
}