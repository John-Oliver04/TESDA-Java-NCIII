package Activity11;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a Binary Number: ");
        String binaryNumberStr = scanner.nextLine();

        int decimalNumber = convertBinaryToDecimal(binaryNumberStr);

        System.out.println("Decimal Number: " + decimalNumber);

        scanner.close();
    }

    public static int convertBinaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }

        return decimal;
    }
}
