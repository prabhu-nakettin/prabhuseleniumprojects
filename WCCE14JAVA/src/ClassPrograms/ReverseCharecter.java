package ClassPrograms;

public class ReverseCharecter 
{
	public static void main(String[] args)
	{
		String s= "prabhu";
		
		String rev=" ";
		
		int len=rev.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);			
		}
			System.out.println(rev);
	}
}


