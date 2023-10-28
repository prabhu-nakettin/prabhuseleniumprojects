package ClassPrograms;

import java.util.Scanner;

public class Factorial
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int temp=1;
		for(int i=1;i<=n;i++)
		{
			temp=temp*i;
		}
			System.out.println("the Factrorail of "+n+": "+temp);		
	}
}
