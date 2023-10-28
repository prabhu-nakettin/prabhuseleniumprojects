package ForLoop;

public class FiveAstricks 
{
	public static void main(String[] args)
	{
		int rows=5;
		int column=5;

		for(int i=0;i<rows;i++)
		{
			if(i<2)
			{

				for(int j=0;j<column;j++)
				{
					System.out.print("*");
				}
			}
			else
			{
				System.out.print("**");
			}
			System.out.println();

		}
		
	}
}
