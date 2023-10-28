package oops;

public class Crow extends Bird1
{
	String color;
	String voice;
	
	Crow(String type,String voice,String color,String color1,String voice1)
	{
		super(type, voice, color);
		this.color=color1;
		this.voice=voice1;
		
	}
	public static void main(String[] args) 
	{
		Bird1 c=new Crow("flying bird", "cow-cow", "balck", "brown", "chiow-chiow");
		Crow b=(Crow)c;               //
		System.out.println(c.type);  // in this program downcasting program
		System.out.println(c.voice);
		System.out.println(c.color);
		System.out.println(b.color);
		System.out.println(c.voice);
		
				
		
	}
}
