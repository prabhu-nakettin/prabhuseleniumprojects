package ClassPrograms;

public class FactorialNumber
{
	public static void main(String[] args) 
	{
		int n=5;
		int factorial=1;

		while(n>0)
		{
			factorial*=n;

			n--;	
		}
		System.out.println("the factorial number is:"+factorial);
	}

}
