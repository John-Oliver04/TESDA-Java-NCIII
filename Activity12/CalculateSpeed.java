package Activity12;

import java.util.Scanner;

public class CalculateSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input distance in meters: ");
        double distanceMeters = scanner.nextDouble();

        System.out.print("Input hour: ");
        int hours = scanner.nextInt();

        System.out.print("Input minutes: ");
        int minutes = scanner.nextInt();

        System.out.print("Input seconds: ");
        int seconds = scanner.nextInt();

        double totalSeconds = hours * 3600 + minutes * 60 + seconds;
        double speedMetersPerSecond = distanceMeters / totalSeconds;
        double speedKilometersPerHour = (distanceMeters / 1000) / (totalSeconds / 3600);
        double speedMilesPerHour = (distanceMeters / 1609) / (totalSeconds / 3600);

        System.out.println("Your speed in meters/second is " + speedMetersPerSecond);
        System.out.println("Your speed in km/h is " + speedKilometersPerHour);
        System.out.println("Your speed in miles/h is " + speedMilesPerHour);

        scanner.close();
    }
}
