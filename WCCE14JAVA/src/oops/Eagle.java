package oops;

public class Eagle extends Bird  // we are useing this program for upcasting 
{
	String bahaviour;
	String color;
	
	
	Eagle(String type,String voice,String color,String bahaviour,String color1)
	{
		super(type, voice, color);
		this.bahaviour=bahaviour;
		this.color=color1;
		
	}
	public static void main(String[] args)
	{
		Bird e=new Eagle("flying bird","chi-chi", "black","Aggresive","brown"); //this program is upcating
		System.out.println(e.type);
		System.out.println(e.voice);
		System.out.println(e.color);
		//System.out.println(e.bahaviour);
		//System.out.println(e.color);
		
		
		
	}
}
