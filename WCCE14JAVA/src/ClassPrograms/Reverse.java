package ClassPrograms;

public class Reverse 
{
	public static void main(String[] args) 
	{
		String s="prabhu";
		
		String rev=" ";
		
		int len=s.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);		
		}
			System.out.println("the reverse name is:"+rev);		
	}

}
