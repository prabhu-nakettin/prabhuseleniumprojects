package String;

public class StringRejex  // Rejex it is used to give the Special character we need to pass index value
{
	public static void main(String[] args) 
	{
		String s="i love india";
		
		String[] str = s.split("",7);
		
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
		
		
		
	}

}
