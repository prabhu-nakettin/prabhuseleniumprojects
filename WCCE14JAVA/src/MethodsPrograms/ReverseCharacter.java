package MethodsPrograms;

public class ReverseCharacter 
{
	public static void main(String[] args) 
	{
		String st="prabhu";
		String rev=" ";

		int len= st.length();//
		
		for(int i=len-1;i>=0;i--)//6 5 4 3 2 1 0   //-1 false	
		{
			rev=rev+st.charAt(i);
		}
			System.out.println("the reverse name is:"+rev);			
	}

}
