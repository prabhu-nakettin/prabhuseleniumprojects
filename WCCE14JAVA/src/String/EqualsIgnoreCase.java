package String;

public class EqualsIgnoreCase 
{
	public static void main(String[] args) 
	{
		String s="HELLOW";
		String v="Hellow";
		String z="hellow";
		
		System.out.println(s.equalsIgnoreCase(v));
		System.out.println(s.equalsIgnoreCase(z));
		System.out.println(z.equalsIgnoreCase(v));
		
		
		
	}

}
