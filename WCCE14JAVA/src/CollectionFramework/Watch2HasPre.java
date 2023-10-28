package CollectionFramework;

import java.util.ArrayList;
import java.util.ListIterator;

public class Watch2HasPre 
{
	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList();
		a.add("fastrack");
		a.add("sonata");
		a.add("rollex");
		a.add("Titan");
		a.add("nise");
		
		ListIterator i = a.listIterator();
		
		while(i.hasNext());
		{
			System.out.println(i.next());
		}
		while(i.hasPrevious())
		{
			System.out.println(i.hasPrevious());
		}	
	}
}
