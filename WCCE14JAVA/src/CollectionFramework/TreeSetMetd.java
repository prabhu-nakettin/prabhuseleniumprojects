package CollectionFramework;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetMetd 
{
	public static void main(String[] args) 
	{
		Set s = new TreeSet();  // index value is also Not Supporting 
		
		s.add(101);
		s.add(50);
		s.add(12);
		s.add(30);
		s.add(45);
		s.add(100);
		s.add(10);
		s.add(10);  // here passed diplicate values it will not Acceept Duplicate values 
		
		System.out.println(s);  // it will print Assending order all objects  
				
	}
}
