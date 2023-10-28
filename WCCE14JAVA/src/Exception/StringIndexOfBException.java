package Exception;

public class StringIndexOfBException 
{
	public static void main(String[] args)
	{
		String s="sabka katega";// here only 12 character are present
		
		try
		{
			System.out.println(s.charAt(-7));
		}
		catch (StringIndexOutOfBoundsException e) 
		{
			System.out.println(e);
		}			
		
	}  

}
