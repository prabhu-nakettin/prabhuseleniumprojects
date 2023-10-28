package Exception;

public class MathOperation
{
	public static void main(String[] args) {

		int num=10;
		int div=0;
		
		try 
		{
			int quo=num/div;
			System.out.println(quo);
			
		} 
		catch (ArithmeticException e) 
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
			
	}
}
