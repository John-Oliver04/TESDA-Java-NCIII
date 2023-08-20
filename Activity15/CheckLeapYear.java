package Activity15;
import java.util.Scanner;

public class CheckLeapYear{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the year
        System.out.print("Input the year: ");
        int year = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Check if it's a leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }

    // Function to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Leap years are divisible by 4, except for years divisible by 100 but not by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
