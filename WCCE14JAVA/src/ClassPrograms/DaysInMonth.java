package ClassPrograms;

import java.util.Scanner;

public class DaysInMonth 
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the month number (1-12): ");
		int month = scanner.nextInt();
		
		int daysInMonth;

		if (month == 2) 
		{
			daysInMonth = 28; // February
		} 
		else if (month == 4 || month == 6 || month == 9 || month == 11) 
		{
			daysInMonth = 30; // April, June, September, November
		} 
		else
		{
			daysInMonth = 31; // January, March, May, July, August, October, December
		}

		System.out.println("Number of days in the given month: " + daysInMonth);
	}
}



