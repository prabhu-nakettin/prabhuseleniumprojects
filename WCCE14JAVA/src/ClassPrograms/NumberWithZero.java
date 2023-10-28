package ClassPrograms;

public class NumberWithZero //atleast one number With 0;
{
	public static void main(String[] args) 
	{
		int start=10;
		int ends=100;
		
		while(start<=ends)
		{
			int copy=start;
			int count=0;
			
			while(copy>0)
			{
				int r=copy%10;
				
				if(r==0)
				{
					count++;
				}
				copy/=10;
			}
			if(count>=1)
			{
				System.out.println(start);
			}
			start++;
		}
		
		
	}

}
