package Array;

import java.util.Scanner;

public class AramStrongNumber3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int m = n;
		int sum = 0;
		int count = 0;

		while (n > 0)   // Calculate the number of digits in the input number
		{
			count++;
			n = n / 10;
		}
		
		n = m;  // Reset n to its original value
		 
		while (m > 0)    // Calculate the sum of the digits each raised to the power of count
		{
			int a = m % 10;
			sum = sum + (int) Math.pow(a, count);
			m = m / 10;
		}
		
		if (sum ==n)  	// Check if the number is an Armstrong number
		{
			System.out.println("This is an Armstrong Number");
		} 
		else
		{
			System.out.println("This is not an Armstrong Number");
		}
	}
}




