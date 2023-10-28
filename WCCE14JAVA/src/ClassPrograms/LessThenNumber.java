package ClassPrograms;

import java.util.Scanner;

public class LessThenNumber 
{
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int a= sc.nextInt();
		
		if(a>500)
		{
			System.out.println("above 500");
		}
		else
		{
			System.out.println("below 500");
		}
		
	}

}
