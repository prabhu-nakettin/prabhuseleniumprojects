package abstrac;

public class Calci1 implements Calci
{
	public void add() //Override the this program
	{
		System.out.println("add the method");
	}
	public static void main(String[] args)
	{
		Calci1 a = new Calci1();
		a.add();
		Calci b=a;
		b.add();
		System.out.println(b.s);
		
		
		
		
		
		//System.out.println(Calci.s);  // Overidden this program 
		
	}
}
