package oops;

public class Crow2 extends Bird2
{
	String color;
	String voice;
	
	Crow2(String type,String voice,String color,String color1,String voice1)
	{
		super(type, voice, color);
		this.color=color1;
		this.voice=voice1;
		
	}
	public static void main(String[] args) 
	{
		Bird2 c=new Bird2("flying bird", "cow-cow", "balck");
		Crow2 b=(Crow2)c; // if we are converting from parent class to child clas downcasting we will get error"java.lang.ClassCastException"  
		System.out.println(c.type);  
		System.out.println(c.voice);
		System.out.println(c.color);
		System.out.println(b.color);
		System.out.println(b.voice);
		
				
		
	}
}



