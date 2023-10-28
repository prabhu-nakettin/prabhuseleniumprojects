package JavaProject;

import java.util.Scanner;

public class ImplementingE_Commerce implements E_Commerce
{	
	static Scanner sc=new Scanner(System.in);
	String username;
	String password;

	ImplementingE_Commerce()
	{
		this. username=username;
		this.password=password;


	}
	public ImplementingE_Commerce(String username2, String password2)
	{

	}
	// TODO Auto-generated constructor stub

	@Override
	public void signUp() 
	{
		boolean b=true;

		while(b)
		{

			System.out.println("Set UserName");
			String username=sc.nextLine();

			if (username.length()>=8 && username.length()<=15)

				b=false;

				System.out.println("Set password");
				String password=sc.nextLine();

				System.out.println("ReEnter the pasword");
				String password1=sc.nextLine();

				if(password.equals(password1))
				{
					ImplementingE_Commerce i=new ImplementingE_Commerce( username, password);
				}
				else
				{
					System.out.println("password Not matching");
				}

			

		}

	}
	

		@Override
		public void login() 
		{


		}

		@Override
		public void cart() 
		{


		}

		@Override
		public void order() 
		{


		}
		public static void main(String[] args) 
		{
			ImplementingE_Commerce e = new ImplementingE_Commerce();
			//System.out.println(e);
			e.signUp();
		}

	}
