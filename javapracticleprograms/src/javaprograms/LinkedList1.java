package javaprograms;

import java.util.LinkedList;

public class LinkedList1 
{
	public static void main(String[] args)
	{
		LinkedList m=new LinkedList();
		m.add(1);
		m.add(300);
		m.add("abc");
		m.add(3,"Prabhu");
		m.add(0.1);
		m.add(1,"ab");
		System.out.println(m);
		m.addFirst(1);
		//System.out.println(m);
		//m.addLast(300);
		//System.out.println(m);
		m.removeFirst();
		System.out.println(m);
		
		
		
		
		
		
		
		
	}

}
