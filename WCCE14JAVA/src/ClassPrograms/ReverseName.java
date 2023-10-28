package ClassPrograms;

public class ReverseName 
{
	public static void main(String[] args) 
	{
		String s="prabhu";
		
		String rev=" ";
		
		int len=s.length();//6/5
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			
			System.out.println(rev);		
		}		
	}
}
