package ClassPrograms;

import java.util.Scanner;

public class CreatedLoginPage 
{
	public static void main(String[] args) 
	{
		String username="ABCD1234";
		String password="ABCD_1234";

		Scanner sc=new Scanner(System.in);
		

		boolean b=true; //

		while(b)
		{
			System.out.println("Enter the username");
			String tempuser=sc.nextLine();
			System.out.println("Enter the password");  
			String temppass=sc.nextLine();

			if(tempuser.equals(username) && temppass.equals(password))
			{
				b=false;
				System.out.println("login is successfully");
			}
			else
			{
				System.out.println("Credential not matching");
			}
		}




	}  



}
