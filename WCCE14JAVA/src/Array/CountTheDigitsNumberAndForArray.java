package Array;

public class CountTheDigitsNumberAndForArray // count the digits number for given number in a Array and reverse it  
{
	public static void main(String[] args) 
	{
		int [] arr= {123,546,675,987,128};

		for(int i=0;i<arr.length;i++)
		{
			int num=arr[i];
			int count=0; //1,2,3

			while(num>0)
			{
				count++;

				System.out.println(num%10); // it will print the reminder
				num=num/10;	// it will any divide number
				
			}
			System.out.println("count of digits in"+arr[i]+" "+ count);
		}
	}


}
