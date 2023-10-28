package CollectionFramework;
import  java.util.ArrayList;
import java.util.Iterator;

public class Watch1 
{
	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList();
		a.add("fastrack");
		a.add("sonata");
		a.add("rollex");
		a.add("Titan");
		a.add("Noise");
		
	 Iterator i =  a. iterator(); // here only use Iterator
	 
	 while(i.hasNext())  // this method is used to cheeck Whether next Element is present inside collections or not 
	{						// if it is present returs true otherwise False;
		 
		 System.out.println(i.next());
		 System.out.println(i.next());// NoSuchElementException becouse// already Exceed for length here
	 }	 
	}
}

		


