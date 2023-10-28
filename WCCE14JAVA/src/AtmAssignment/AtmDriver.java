package AtmAssignment;

import java.util.Scanner;

public class AtmDriver 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		Bank c1=new Bank("Prabhu", 1022l, 500,1111);

		Atm a=new AtmChild();

		boolean b=true;

		while(b)
		{
			System.out.println("Enter 1 for Withdraw \nEnter 2 for Deposit \nEnter 3 for CheckBalance \nEnter 4 for Change Pin \nEnter 5 for Details");
			int option= sc.nextInt();

			switch (option) 
			{
			case 1: 
			{

				a.withdraw(c1);
				break;
			}
			case 2: 
			{

				a.deposit(c1);
				break;
			}
			case 3: 
			{

				a.checkBalance(c1);
				break;
			}
			case 4: 
			{

				a.changePin(c1);
				break;
			}
			case 5: 
			{

				a.detsils(c1);
				break;
			}
			default:

				System.out.println("Chose Correct option");
			}

			System.out.println("Do you want continue this operation then press:"+1+"\nPress any key for Exit");
			int v=sc.nextInt();
			if(v!=1)
			{
				b=false;

			}
		}
	}
}



















