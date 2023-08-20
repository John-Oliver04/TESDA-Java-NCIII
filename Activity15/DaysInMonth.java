package Activity15;
import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the month number
        System.out.print("Input a month number: ");
        int month = scanner.nextInt();

        // Input the year
        System.out.print("Input a year: ");
        int year = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Define an array to store the number of days in each month
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Check for a leap year (February has 29 days in a leap year)
        if (isLeapYear(year)) {
            daysInMonth[2] = 29;
        }

        // Check if the month input is valid
        if (month >= 1 && month <= 12) {
            String monthName = getMonthName(month);
            int numberOfDays = daysInMonth[month];

            System.out.println(monthName + " " + year + " has " + numberOfDays + " days");
        } else {
            System.out.println("Invalid month input. Month must be between 1 and 12.");
        }
    }

    // Function to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Function to get the name of a month based on its number
    public static String getMonthName(int month) {
        String[] monthNames = {"", "January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};
        return monthNames[month];
    }
}
