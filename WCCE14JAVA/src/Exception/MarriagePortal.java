package Exception;

import java.util.Scanner;

public class MarriagePortal 
{
	public static void main(String[] args) throws InvalidAgeException
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age=sc.nextInt();

		if(age>=21)
		{
			System.out.println("Go and get marry");
		}
		else
		{
			//throw new InvalidAgeException("age is less");// before handling Exception
			try
			{
				throw new InvalidAgeException("age is less");	
			}
			catch(InvalidAgeException  e)
			{
				System.out.println(e.getMessage());
				e.printStackTrace();
			}

		}



	}

}
