package Array;

import java.util.Scanner;

public class TwoDArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		
		int row=3;
		int col=2;
		
		String [][] str=new String[row] [col];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				str [i][j]=sc.nextLine();
				
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.println(str[i][j]);
			}
		}
		
	}
}
