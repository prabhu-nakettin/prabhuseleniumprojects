package abstrac;

public class Dog implements Animal,Mammal

{
	public void eat() 
	{

		System.out.println("all dog are Eating");
	}
	public void sound()
	{
		System.out.println("All Dog are sounds are Bow-=Bow");
	}
	public void thinking() 
	{
		System.out.println("Dogs can Think");
	}
	public void lifestyle()
	{
		System.out.println("Dogs Lives in group");
	}
	public static void main(String[] args) 
	{
		Animal d= new Dog();// Here Upcasting the Parent Interface Animal
		d.eat();
		d.sound();
		Mammal a=(Mammal)d;  //hre parent is Animal and sub parent is mammal and here useing Type cast operator
		a.thinking();
		a.lifestyle();
	}

}
