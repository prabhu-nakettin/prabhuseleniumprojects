package javaprograms;

public interface PerfectNumber 
{
	public static void main(String[] args) 
	{
		int n=28;
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;

			}
		}
		if(sum==n)
		{
			System.out.println("perfect Number");
		}
		else
		{
			System.out.println("Not perfect number");
		}
	} 
}
