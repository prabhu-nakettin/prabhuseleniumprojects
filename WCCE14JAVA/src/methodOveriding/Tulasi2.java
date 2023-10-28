package methodOveriding;

public class Tulasi2 
{
	protected void generateOxygen()
	{
		System.out.println("tulasi provide good Oxygen as well as to avoid the Bactaria");
	}
	public static void main(String[] args)
	{
		Tree t= new Tree();
		t.generateOxygen();
		
		Tulasi t2=new Tulasi();
		Tree t3=t2;          // in this prgram i have upcasting parent class
		t.generateOxygen();
		t2.generateOxygen();
		
		//Tree t3=t2; // in this prgram i have upcasting parent class
		
		
		
		
	}
}

