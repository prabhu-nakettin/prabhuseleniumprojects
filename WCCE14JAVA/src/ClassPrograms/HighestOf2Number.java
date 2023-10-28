package ClassPrograms;

public class HighestOf2Number 
{
	public static void main(String[] args) 
	{
		int a=70;
		int b=60;
		int c=70;
		int d=((a>b&&a>c)?a:(b>c)?b:c);
		System.out.println(d);
		
		// OR
		
		//System.out.println((a>b&&a>c)?"a is greater":(b>c)?"b is greater":"c is greater");
		
	}

}
