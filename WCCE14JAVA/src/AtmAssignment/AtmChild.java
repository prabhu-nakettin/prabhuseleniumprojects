package AtmAssignment;

import java.util.Scanner;

import MethodsPrograms.Amdsm;

public class AtmChild implements Atm 
{
	Scanner sc= new Scanner(System.in);

	public void withdraw(Bank b)
	{
		boolean condition=true;
 
		while(condition)
		{
			System.out.println("Enter the pin ");
			int pin= sc.nextInt();
			
			if(b.getPin()==pin)
			{
				System.out.println("Enter amount to be withdraw");
				int amount= sc.nextInt();
				
				if(b.getBal()>=amount)
				{
					b.setBal(b.getBal()-amount);
					System.out.println("your transction is Rs."+amount+ "\nSuccessful");
					condition=false;
				}
				else
				{
					System.out.println("insuffcient fund");
				}
				
			}
			else
			{
				System.out.println("Enter Wrong pin");
			}
			
		}
				
	}

	public void deposit(Bank b) 
	{
		boolean conditon=true;
		
		while(conditon)
		{
			System.out.println("Enter the pin");
			int pin= sc.nextInt();
			
			if(b.getPin()==pin)
			{
				System.out.println("Enter the amount for deposit");
				int amount=sc.nextInt();
				
				b.setBal(b.getBal()+amount);
				
				System.out.println("your transction is successfully \nRs."+amount+"Credited to your number:"+b.acNumber);
				System.out.println("your current account balance is:"+b.getBal());
				conditon=false;
			}
			else
			{
				System.out.println("Enter Wrong pin");
			}
		}
	}

	public void checkBalance(Bank b) 
	{
		boolean condtion=true;
		
		while(condtion)
		{
			System.out.println("Enter your pin");
			int pin=sc.nextInt();
 
			if(b.getPin()==pin)
			{
				System.out.println(" your account balance is:"+b.getBal());
				condtion=false;
			}
			else
			{
				System.out.println("Entered wrong pin");
			}
		}
		
	}

	public void changePin(Bank b) 
	{
		boolean condition=true;
		
		while(condition)
		{
			System.out.println("Enter your pin");
			int pin=sc.nextInt();
			
			if(b.getPin()==pin)
			{
				System.out.println("Enter your old  pin");
				int oldpin=sc.nextInt();
				
				if(b.getPin()==oldpin)
				{
					boolean c2=true;
					while(c2)
					{
						System.out.println("Enter new pin");
						int newpin=sc.nextInt();
						System.out.println("Re-Enter new pin");
						int repin=sc.nextInt();
						
						if(newpin==repin)
						{
							b.setPin(newpin);
							c2=false;
							condition=false;
							System.out.println("pin successfully changed");
						}
						else
						{
							System.out.println("old pins are not matching");
							
						}
					}
					
				}
				else
				{
					System.out.println("entered wrong pin");
				}
			}
		}
	}

	public void detsils(Bank b) 
	{
		 boolean condition=true;
		 
		 while(condition)
			 System.out.println("Enter the pin");
		 	int pin= sc.nextInt();
		 	
		 	if(b.getPin()==pin)
		 	{
		 		b.getDetails();
		 		condition=false;
		 		System.out.println("pin is Successfully");
		 	}

	}
}



