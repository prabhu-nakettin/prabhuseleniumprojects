package ClassPrograms;

public class DigitsOfNumber //print the Digits present in a given number
{
	public static void main(String[] args) 
	{
		int num=245;
		
		while(num>0)
		{
			int r=num%10;
			System.out.println(r);
			num=num/10;
			
		}
					
	}
	
}
