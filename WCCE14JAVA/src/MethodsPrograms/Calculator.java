package MethodsPrograms;

import java.util.Scanner;

public class Calculator 
{
	public static int add1(int a, int b)
	{
		int res=a+b;
		return res;
	}
	public static int sub(int a, int b)
	{
		int res=a-b;
		return res;
	}
	public static int mul(int a, int b)
	{
		int res=a*b;
		return res;
	}
	public static int div(int a, int b)
	{
		int res=a/b;
		return res;
	}
	public static int mod(int a, int b)
	{  
		int res=a%b;
		return res;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values");
		int num1=sc.nextInt();
		char op= sc.next().charAt(0); 
		int num2=sc.nextInt();
		int result=0;


		switch (op)
		{
		case '+':
		{
			result=add1(num1,num2);
			break;
		}
		case '*':
		{
			result=mul(num1,num2);
			break;
		}
		case  '/':
		{
			result=div(num1,num2);
			break;
		}
		case  '-':
		{
			result=sub(num1,num2);
			break;
		}
		case  '%':
		{
			result=mod(num1,num2);
			break;

		}




		default:
		{	

			System.out.println(" invalid choice");
		}
		}
		System.out.println("the result is:"+result);

	}
}














