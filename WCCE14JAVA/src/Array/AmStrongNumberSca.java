package Array;

import java.util.Scanner;  

public class AmStrongNumberSca 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int count=0;  // to count the digits this is a duplicate variable
		int m=n;   	// it will convert //n number all value to //m
		int sum=0;	// it will add the summetion 
		
		while(n>0)
		{
			count++;
			n=n/10;
		}
		
		n=m;  // Reset n to its original value

		while(m>0)
		{
			int rem=m%10;
			sum=sum+(int)Math.pow(rem, count);
			m=m/10;
		}
		if(sum==n)
		{
			System.out.println("this  is an Armstrong Number");
		}
		else
		{
			System.out.println("This is not an Armstrong Number");
		}
	}

}









