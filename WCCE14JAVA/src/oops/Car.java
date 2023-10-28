package oops;

public class Car   //Has A Relationship // we need to create an a object
{
	String brand;
	double speed;
	
	public void start()
	{
		Engine e= new Engine();
		e.start();
		System.out.println("Car started");
	}
	public void stop()
	{
		Break b=new Break();
		b.stop();
		System.out.println("Car Stoped");
	}
	public static void main(String[] args) 
	{
		
		Car c=new Car();
		c.start();
		c.stop();
	}
	
}
