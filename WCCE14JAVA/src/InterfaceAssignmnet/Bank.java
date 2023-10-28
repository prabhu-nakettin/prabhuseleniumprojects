package InterfaceAssignmnet;

public class Bank implements Atm
{
	public void withdraw()
	{
		System.out.println("this is Withdraw method");
	}
	public static void main(String[] args) 
	{
		Atm b=new Bank();
		b.withdraw();
		
	}

}
