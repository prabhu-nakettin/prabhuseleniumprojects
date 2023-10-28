package Exception;

public class NullPoiterExce
{
	public static void main(String[] args)
	{
		String s=null;
		
		//System.out.println(s.length());
		
		try
		{
			System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

}
