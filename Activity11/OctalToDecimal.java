package Activity11;

import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input any Octal Number: ");
        String octalNumberStr = scanner.nextLine();

        int decimalNumber = convertOctalToDecimal(octalNumberStr);

        System.out.println("Equivalent Decimal Number: " + decimalNumber);

        scanner.close();
    }

    public static int convertOctalToDecimal(String octal) {
        int decimal = 0;
        int power = 0;

        // Reversing the octal string for easier processing
        String reversedOctal = new StringBuilder(octal).reverse().toString();

        for (int i = 0; i < reversedOctal.length(); i++) {
            int digit = Character.getNumericValue(reversedOctal.charAt(i));
            decimal += digit * Math.pow(8, power);
            power++;
        }

        return decimal;
    }
}
