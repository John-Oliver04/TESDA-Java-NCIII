package Activity11;

import java.util.Scanner;

public class HexaDecimalToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a Hexadecimal Number: ");
        String hexNumberStr = scanner.nextLine();

        int decimalNumber = convertHexadecimalToDecimal(hexNumberStr);

        System.out.println("An equivalent Decimal Number is: " + decimalNumber);

        scanner.close();
    }

    public static int convertHexadecimalToDecimal(String hex) {
        return Integer.parseInt(hex, 16);
    }
}
