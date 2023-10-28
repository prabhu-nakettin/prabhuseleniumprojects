package Exception;

import java.util.Scanner;

public class BankAtm 
{
	public static void main(String[] args) throws InSufficientBalanceException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Amount");
		
		BankAccount b = new BankAccount(1000.6);
		
		double withamount=sc.nextDouble();
		try 
		{
            b.withdraw(withamount);
        } 
		catch (InSufficientBalanceException i)
		{
            System.out.println(i);
        } 
		finally 
		{
            sc.close();
		}
	}

}
