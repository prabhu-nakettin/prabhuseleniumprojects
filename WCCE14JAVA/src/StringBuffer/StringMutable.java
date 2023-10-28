package StringBuffer;

public class StringMutable 
{
	public static void main(String[] args)
	{
		StringBuffer str=new StringBuffer("Hum Nhi ");
		System.out.println(str.append("Sudarange"));
		System.out.println(str);
		
		System.out.println(str.replace(4,8,"Kabhi Nhi"));
		System.out.println(str);
		
		System.out.println(str.delete(4,10));
		System.out.println(str);
		
		System.out.println(str.reverse());
		System.out.println(str);	
		
	} 
	
}
