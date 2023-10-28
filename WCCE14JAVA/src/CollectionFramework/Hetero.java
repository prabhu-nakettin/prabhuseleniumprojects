package CollectionFramework;

import java.util.ArrayList;

public class Hetero 
{

	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(124.876);	 // hetrogenoious in nature only not hertrogenious  these all element different we are string only references
		a.add(true);
		a.add('z');
		a.add("java");   //this value present String Constant pool only Stored

		System.out.println(a);
		System.out.println(a.contains("java")); // true //it will search valuse whatever value we passing inside contains
		System.out.println(a.contains('c'));   //False  C value is not present inside element//
		
		System.out.println(a.indexOf("java"));// it will count the index of Element inside a reference collection veriable 
		System.out.println(a.indexOf("aja"));
		
		ArrayList v = new ArrayList();
		v.add('v');
		v.add(1234);
		v.add(10);
		v.add(124.876);
		v.add(true);
		v.add('z');
		v.add("java");
		v.add(34);
		System.out.println(v);
		System.out.println(v.containsAll(a));
		
		ArrayList b = new ArrayList();
		b.add('v');
		b.add(1234);
		b.add(10);
		b.add(124.876);
		b.add(true);
		b.add('z');
		b.add("java");
		b.add(34);
		System.out.println(b);
		System.out.println(b.containsAll(v));  // it will check all elements are present inside  b or not all the v Object all elemnts stpred inside b
		
		
		
		
	}

}
