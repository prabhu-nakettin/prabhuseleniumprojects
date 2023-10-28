package Exception;

import java.util.Scanner;

public class MultipleCatchExample 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers:");

		try {
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();

			int result = divideNumbers(num1, num2);
			System.out.println("Result of division: " + result);
		} 
		catch(ArithmeticException e) // this is child class Exception 
		{
			System.out.println("Arithmetic Exception occurred: " + e.getMessage());
		} 
		
		catch (Exception  e) // this patrent type Exception
		{
			System.out.println("Some other Exception occurred: " + e.getMessage());
		} 		
	}


	public static int divideNumbers(int n1, int n2) {
		return n1/ n2;
	}
}



