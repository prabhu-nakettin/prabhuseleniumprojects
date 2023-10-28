package Array;

public class AmstrongNumber 
{
	public static void main(String[] args) //
	{
		int num=1634;  // without useing Scanner class
		int count=0;
		int copy=num;
		int sum=0;
		int flag=num;

		while(num>0)  //  // Calculate the number of digits in the input numbe
		{
			count++;
			num=num/10;
		}
		
		//num=copy;       // Reset num to its original value
		
		while(copy>0)
		{
			int rem=copy%10;  // it will give the reminder value of digits
			int power=1;      // power of digits is=01

			for(int i=1;i<=count;i++)
			{
				power*=rem;

			}
			sum+=power;
			copy=copy/10;

		}
		if(flag ==sum)
		{
			System.out.println("this is an amstrong number");

		}
		else
		{
			System.out.println("this is not an amstrong number");

		}

	}

}



