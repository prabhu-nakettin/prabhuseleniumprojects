package Array;

import java.util.Scanner;

public class StudentsMarks2 // initalization and accessing values from an array by useing looping Statement
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks");
		
		int [] marks=new int [5];
		
		for(int i=0;i<marks.length;i++)
		{
			marks[i]=sc.nextInt();
					
		}
		for(int i=0; i<marks.length;i++)
		{
			System.out.println("marks of"+(i+1)+"index Student:"+marks[i]);
		}
	}
}
