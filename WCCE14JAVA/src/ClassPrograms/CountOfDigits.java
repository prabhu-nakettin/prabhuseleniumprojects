package ClassPrograms;

public class CountOfDigits // Count the Digits present inside a number?
{
	public static void main(String[] args)
	{
		int num=245;
		int count=0;

		while(num>0)
		{
			count++;
			num=num/10;
		}
		System.out.println(count);
	}

}
