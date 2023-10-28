package ClassPrograms;

public class Pattern3 
{
	public static void main(String[] args) 
	{
		int i=1;

		while(i<=5)
		{
			int j=1;
			int x=i;
			while(j<=5)
			{
				System.out.print(x++);
				j++;
			}
			i++;
			System.out.println();
		}
		
	}

}
