package Array;

public class PrimeNumber // not Execute Properly i need check for Chat GPT
{
	public static void main(String[] args) 
	{
		int num=13;	
		
		int Factorial=0;
		
		for(int i=0;i>=num;i++)
		{
			if(num%i==0)
			{
				Factorial++;
			}		
		}
		if(Factorial==2)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("Not a Prime Number");
		}
		
	}
}
