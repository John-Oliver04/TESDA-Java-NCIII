package Activity11;

import java.util.Scanner;

public class OctalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input any Octal Number: ");
        String octalNumberStr = scanner.nextLine();

        String binaryNumber = convertOctalToBinary(octalNumberStr);

        System.out.println("Equivalent Binary Number: " + binaryNumber);

        scanner.close();
    }

    public static String convertOctalToBinary(String octal) {
        StringBuilder binary = new StringBuilder();

        for (int i = 0; i < octal.length(); i++) {
            int digit = Character.getNumericValue(octal.charAt(i));
            // Convert each octal digit to its binary representation
            String binaryDigit = String.format("%03d", Integer.parseInt(Integer.toBinaryString(digit)));
            binary.append(binaryDigit);
        }

        return binary.toString();
    }
}
