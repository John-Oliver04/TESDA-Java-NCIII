package Activity11;

import java.util.Scanner;

public class HexaDecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Hexadecimal Number: ");
        String hexNumberStr = scanner.nextLine();

        String binaryNumber = convertHexadecimalToBinary(hexNumberStr);

        System.out.println("Equivalent Binary Number is: " + binaryNumber);

        scanner.close();
    }

    public static String convertHexadecimalToBinary(String hex) {
        StringBuilder binary = new StringBuilder();

        for (int i = 0; i < hex.length(); i++) {
            char hexDigit = hex.charAt(i);
            int decimalValue = Character.digit(hexDigit, 16);
            String binaryValue = String.format("%4s", Integer.toBinaryString(decimalValue)).replace(' ', '0');
            binary.append(binaryValue);
        }

        return binary.toString();
    }
}
