package StringPrograms;

public class practice // reverse of digits
{
	public static void main(String[] args) 
	{
		String s="i am Stying near shivaji chowk ";
		
		String temp=" ";
		
		int count=0;//1
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a')
			{
				count++;
				
				if(count>0)
				{
					temp+='@';
					
				}
				else
				{
					temp+=s.charAt(i);
				}
				
			}
			else
			{
				temp+=s.charAt(i);
			}
		}	System.out.println(temp);
		
		
	}

}
