package CollectionFramework;

import java.util.ArrayList;

public class StudentName 
{
	public static void main(String[] args)
	{
		ArrayList a = new ArrayList();
		a.add("Sakshi");
		a.add("Jaya prakash");
		a.add("Ankit");
		a.add("himani");
		a.add("Ashish");
		a.add("prassanna");
		
		System.out.println(a);
		System.out.println(a.remove("himani")); // it will remove element whichever we are value inside by useing Remove Method
		System.out.println(a);
		
		System.out.println(a.remove(1));// it will remove index name
		System.out.println(a);
		
		ArrayList m = new ArrayList();
		m.add("nagesh");
		m.add("jayaprakash");
		m.add("ketan");
		m.add("Ankit");
		System.out.println(m);
		
		ArrayList b = new ArrayList();
		b.add("Supriya");
		b.add("himani");
		b.add("Ashish");
		b.add("prasanna");
	
		
		System.out.println("a"+a);
		System.out.println("m"+m);
		System.out.println("b"+b);
		System.out.println(m.removeAll(a));
		System.out.println(a.retainAll(b));
		System.out.println("m.removeAll(a) ");// it will remove Duplicate values inside present removeall method not consider repeted valuse 
		System.out.println("m"+m);
		System.out.println("b"+b);
		System.out.println("a.retainAll ()b");// it will only keep it  Duplicate values and it will unique values
		System.out.println("a"+a);
		
		b.remove(2);			// it will Remove the value  whatever we are passing index Number
		System.out.println("b:"+b);
		
		
		
		
		
		
		
		
		  
	}

}
