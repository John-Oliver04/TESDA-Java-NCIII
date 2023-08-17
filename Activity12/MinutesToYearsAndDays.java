package Activity12;
import java.util.Scanner;

public class MinutesToYearsAndDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the number of minutes: ");
        long minutes = scanner.nextLong();

        if (minutes < 0) {
            System.out.println("Please enter a positive number of minutes.");
            scanner.close();
            return;
        }

        long minutesInYear = 365 * 24 * 60;
        long years = minutes / minutesInYear;
        long remainingMinutes = minutes % minutesInYear;

        long days = remainingMinutes / (24 * 60);

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");

        scanner.close();
    }
}
