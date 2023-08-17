package Activity12;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CurrentTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the time zone offset to GMT: ");
        int timeZoneOffset = scanner.nextInt();
        scanner.close();

        ZoneOffset offset = ZoneOffset.ofTotalSeconds(timeZoneOffset * 60);
        ZonedDateTime currentTime = ZonedDateTime.now(offset);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = currentTime.format(formatter);

        System.out.println("Current time is " + formattedTime);
    }
}
