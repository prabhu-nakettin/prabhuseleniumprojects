package Exception;

public class ArrayIndexOfBoundException 
{
	public static void main(String[] args) {


		int [] n= {1,2,3,4,5};
		
		try
		{
			System.out.println(n[6]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		
		 
	}

}
