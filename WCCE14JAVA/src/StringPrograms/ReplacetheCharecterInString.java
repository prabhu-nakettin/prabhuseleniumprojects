package StringPrograms;

public class ReplacetheCharecterInString
{
	public static void main(String[] args) 
	{
		String s = "Bangalore is no1 city compare to pune"; /// it will replace the value 
		
		int count = 0;//1	///Initialize count to 0, which will be used to count 'a' characters
			
		String temp = " "; 	// Initialize an empty string 'temp' to store modified characters
		
		for (int i = 0; i <s.length(); i++)  // Loop through each character in the input string  
		{
			if (s.charAt(i) =='a') 			// Check if the current character is 'a'
			{
				count++;			//Increment the 'a' count
				
				if (count>0) 		// Check if there is at least one 'a' is there 
				{					
					temp+='@';   //// Replace subsequent 'a' characters with '@'
				} 
				else 
				{
					temp += s.charAt(i);  //// If it's the first 'a', keep it as it is
				}
			} 
			else 
			{
				temp += s.charAt(i);   // For characters other than 'a', append them to 'temp'
		    }			
		}
		System.out.println(temp);  // Print the modified string
	}
}


