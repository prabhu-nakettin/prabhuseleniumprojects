package javaprograms;

import java.util.Scanner;

public class RediousAreaOfCircle
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Area of circle");
		sc.close();

		double redious = sc.nextDouble();// user wil get decimal Value
		
		// logic for writing calcilate of Area of circle

		System.out.println("Area of the  given circle the given redious"+redious+"is:"+(Math.PI*redious*redious));

	}

}
