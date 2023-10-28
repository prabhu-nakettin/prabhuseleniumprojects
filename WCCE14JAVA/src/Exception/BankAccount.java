package Exception;

public class BankAccount 
{
	private double balance;
	
	BankAccount(double balance)
	{
		this.balance=balance;
	}
	
	public void withdraw(double amount) throws InSufficientBalanceException
	{
		if(amount>balance)
		{
			throw new InSufficientBalanceException("Exceed your amount");
			
		}
		balance -=amount;
		System.out.println("withdraw sucessfull remaing bal:"+balance);					
	}

}
