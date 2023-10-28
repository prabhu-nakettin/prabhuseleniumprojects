package ForLoop;

public class PatternProgram 
{
	public static void main(String[] args) 
	{
		for(int r=1;r<=5;r++)
		{
			for(int c=1;c<=5;c++)
			{
				if(r>=3 && c>=3)
				{

				}

				else if((r==5 && c==2)||(r==2 && c==5)) 
					
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(" * ");
				}
			}
			System.out.println();
		}
	}
}
