package Array;

public class EvenNumberInArray 
{
	public static void main(String[] args) 
	{
		int [] arr= {123,456,768,965,444,};

		for(int i=0;i<arr.length;i++)
		{
			int num=arr[i];
			int count=0;

			while(num>0)
			{
				int digits=num%10;

				if(digits%10==0)
				{
					count++;
					
				}
				num=num/10;				
			}
			if(count>=2)
			{
				System.out.println(arr[i]);

			}			
		}
		
	}
}
