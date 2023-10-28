package staticMethod;

import java.util.Scanner;

public class Atm 
{
	static String transctions;
	static int pin;

	static
	{
		transctions="withdraw";
		pin=1234;
	}
	public static void withdraw()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the amount");
		int amount=sc.nextInt();
		System.out.println("your amount Rs:"+amount+ "withdraw Successfully");
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your pin");
		int pin=sc.nextInt();

		if(Atm.pin==pin) 
		{
			withdraw();
		}
		else
		{
			System.out.println("invalid pin");
		}

	}


}
