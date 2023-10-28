import java.util.Scanner;

public class Addition 
{
	public static int add(int a, int b)
	{
		int  sum=a+b;
		return sum;
		
	} 
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		{
			System.out.println("enter the number");
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			int sum=add(num1,num2);
			
			
			System.out.println("addtion of"+num1+"& " +num2+":"+sum);
			
			
			
			
		}
		
	}
}


	
