package CollectionFramework;

import java.util.HashSet;
import java.util.Set;

public class MoviesNamesHashN
{
	public static void main(String[] args)
	{
		Set s = new HashSet();  // hetrogenious in nature
		
		s.add("kgf");
		s.add("Gadar");
		s.add("Drama");
		s.add("Doom");
		s.add("Kantara");
		s.add(true);
		s.add(123);
		s.add("Java");
		s.add(123);   // this duplicate value it will not Support Dupliate Values
		
		System.out.println(s);      // it will print in between objects and Elements
		
		
		
	}

}
