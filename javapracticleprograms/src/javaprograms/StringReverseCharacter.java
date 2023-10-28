package javaprograms;

public class StringReverseCharacter 
{
	public static void main(String[] args) {



		String str="ABCD";
		String rev="";

		int len=str.length(); // it will find the lenth //ABCD//4

		for(int i=len-1;i>=0;i--)	//3 2 1 0 -1
		{
			rev=rev+str.charAt(i);//DCBA

		}
			System.out.println("The rev Number is:"+rev);

	}	
}

 


