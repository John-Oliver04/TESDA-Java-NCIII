package Activity12;

import java.util.Scanner;

public class CurrentTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the time zone offset in hours: ");
        int hoursOffset = scanner.nextInt();

        System.out.print("Input the time zone offset in minutes: ");
        int minutesOffset = scanner.nextInt();

        int totalOffsetMinutes = hoursOffset * 60 + minutesOffset;

        long currentTimeMillis = System.currentTimeMillis();
        long gmtTimeMillis = currentTimeMillis - (totalOffsetMinutes * 60 * 1000);

        long totalSeconds = gmtTimeMillis / 1000;
        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;

        System.out.printf("Current time in GMT is %02d:%02d:%02d%n", currentHour, currentMinute, currentSecond);

        scanner.close();
    }
}

