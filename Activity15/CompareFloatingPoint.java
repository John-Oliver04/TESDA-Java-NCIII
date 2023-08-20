package Activity15;
import java.util.Scanner;

public class CompareFloatingPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the first floating-point number
        System.out.print("Input floating-point number: ");
        double number1 = scanner.nextDouble();

        // Input the second floating-point number
        System.out.print("Input another floating-point number: ");
        double number2 = scanner.nextDouble();

        // Close the scanner
        scanner.close();

        // Round the numbers to three decimal places
        double roundedNumber1 = Math.round(number1 * 1000.0) / 1000.0;
        double roundedNumber2 = Math.round(number2 * 1000.0) / 1000.0;

        // Compare the rounded numbers
        if (roundedNumber1 == roundedNumber2) {
            System.out.println("They are the same");
        } else {
            System.out.println("They are different");
        }
    }
}
