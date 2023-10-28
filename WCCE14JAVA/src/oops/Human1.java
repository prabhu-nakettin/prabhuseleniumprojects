package oops;

public class Human1 // in this program we declared constructor classes this call Statement
{
	String name;
	int age;				// this all commn properties
	double weight;
	double height;
	Human1(String name,int age,double weight,double height)
	{
		this(age,weight,height);    // this call statement
		this.name=name;
		System.out.println("abc");
	}
	Human1(int age,double weight,double height)
	{ 
		this(weight,height);
		this.age=age;
		System.out.println("xyz");

	}
	Human1(double weight,double height)
	{
		this(weight);
		this.height=height;
		System.out.println("weight");

	}
	Human1(double weight)
	{
		this.weight=weight;
		System.out.println("weight");
	}
	public static void main(String[]args)
	{
		Human1 b=new Human1("prabhu",28,67,5.5);
		System.out.println(b.name);
	}

}




