package abstrac;

public class Driver1 extends Bike
{
	static Vehicle v;

	public static void main(String[] args) 
	{
		v=new Car();
		v.breakingSystem();
		
		v=new Bike();
		v.breakingSystem();
		
	}
}
