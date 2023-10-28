package ClassPrograms;

public class AtleastNumberWithZero 
{
	public static void main(String[] args)
	{
		
		int start=10;
		int end=100;
		
		for(;start<=end;start++)
		{
			int count=0;
			for(int i=start;i>0;i/=10)
			{
				int r=i%10;
				if(r==0)
				{
					count++;
				}
			}
			if(count>=1)
			{
				System.out.println(start);
			}
		}
	}

}
