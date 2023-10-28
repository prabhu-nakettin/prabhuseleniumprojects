package CollectionFramework;

import java.util.ArrayList;

public class MibileCollection 
{
	public static void main(String[] args) 
	{

		ArrayList a=new ArrayList();  // hetroginious type of data // total there is 21 method
		a.add("Samsung s2");
		a.add("Nokia");
		a.add("Nothing phone");
		a.add("Moto G72");
		System.out.println(a);
		a.add(2,"Google Pixel");  // it will Save index number 2 and then 2 index value Swifted 3 inde x  forward way
		System.out.println(a);

		ArrayList x = new ArrayList(); // return type is Boolean
		x.add("vivo");
		x.add("Redmi");
		x.add("oppo");
		x.add("One plus");
		a.addAll(0,x); // it will swifted all eleemnts inside A object form index number Starting to it will swifted forwaed all elements next index
		System.out.println(x);



		a.addAll(x);  // it will consider only one refrence for all and we  will add x Elememnt to a Reference variable
		System.out.println(a);

		System.out.println(x);
	}



}
