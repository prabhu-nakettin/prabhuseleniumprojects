package ClassPrograms;

import java.util.Scanner;

public class MonthDays 
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the month number (1-12): ");
		int month = scanner.nextInt();
		scanner.close();

		int daysInMonth;

		switch (month) {
		case 2:
			daysInMonth = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			daysInMonth = 30;
			break;
		default:
			daysInMonth = 31;
			break;
		}

		System.out.println("Number of days in the given month: " + daysInMonth);
	}
}



