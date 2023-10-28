package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class Watch
{
	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList();
		a.add("fastrack");
		a.add("sonata");
		a.add("rollex");
		a.add("Titan");
		a.add("nise");
		
		System.out.println(a.get(2));  //this metod is used to retrive the valuse with the help of index value  
				
		// below we are using iterator
		Iterator i = a.iterator();
	
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		
		System.out.println(i.next()); // No 06 Here we will get Exception//NoSuchElementException 	
	}

}
