package StringPrograms;

public class CharecterOnNextLine  // print the words of each digits charecter on next line and count the digits;
{
	public static void main(String[] args)
	{
		String s="Good Night";
		
		int count=0;
		
		String  temp=" ";
		
		for(int i=0;i<s.length();i++)
		{
			count++;
			System.out.println(s.charAt(i));			
		}
			System.out.println("the number of digits is:"+count+":"+temp);		
	}
}
