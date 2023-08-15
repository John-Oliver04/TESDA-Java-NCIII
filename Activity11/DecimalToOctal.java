package Activity11;

import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a Decimal Number: ");
        int decimalNumber = scanner.nextInt();

        String octalNumber = convertDecimalToOctal(decimalNumber);

        System.out.println("Octal number is: " + octalNumber);

        scanner.close();
    }

    public static String convertDecimalToOctal(int decimal) {
        StringBuilder octal = new StringBuilder();

        while (decimal > 0) {
            int remainder = decimal % 8;
            octal.insert(0, remainder);
            decimal /= 8;
        }

        return octal.toString();
    }
}
