package abstrac;

public class Child1 extends AtmChild
{
	public void withdraw()
	{
		System.out.println("Withdraw");
	}
	public static void main(String[] args)
	{
		AtmChild b=new Child1();
		b.withdraw();
	}
}
