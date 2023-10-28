package ClassPrograms;

public class SumOffEvenNumber 
{
	public static void main(String[] args)

	{
		int i =1;
		int sum=0;
		while(i<=25)
		{
			if(i%2==0)
			{
				sum+=i;
				
			}
			
			i++;	
		}
		System.out.println("sum of even number is:"+sum);
		
	}
}
