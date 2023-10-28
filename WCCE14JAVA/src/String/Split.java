package String;

public class Split 
{
	public static void main(String[] args)
	{
		String s= "I Love My Country";
		
		String[] str = s.split(" ");// here given Space and // split methid it will spilt the data
		
		for(int i=0;i<str.length;i++)  // Length method it will check for data lenght 
		{
			System.out.println(str[i]);
		}
		
	}

}
