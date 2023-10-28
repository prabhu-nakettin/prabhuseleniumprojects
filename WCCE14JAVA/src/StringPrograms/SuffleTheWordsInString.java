package StringPrograms;

import java.util.HashSet;

public class SuffleTheWordsInString 
{
	public static void main(String[] args) 
	{
		String s="Today india pakistan match is there";
		int count=0;
		String [] temp=s.split(" ");
		
		HashSet hs=new HashSet();
		
		for(int i=0;i<temp.length;i++)
		{
			hs.add(temp[i]);
			
		}
		System.out.println(hs);
	}

}
