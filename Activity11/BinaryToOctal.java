package Activity11;

import java.util.Scanner;

public class BinaryToOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a Binary Number: ");
        String binaryNumberStr = scanner.nextLine();

        String octalNumber = convertBinaryToOctal(binaryNumberStr);

        System.out.println("Octal number: " + octalNumber);

        scanner.close();
    }

    public static String convertBinaryToOctal(String binary) {
        // Padding the binary string with zeros if its length is not a multiple of 3
        while (binary.length() % 3 != 0) {
            binary = "0" + binary;
        }

        StringBuilder octal = new StringBuilder();

        // Converting groups of 3 bits at a time to octal
        for (int i = 0; i < binary.length(); i += 3) {
            String group = binary.substring(i, i + 3);
            int decimal = Integer.parseInt(group, 2);
            octal.append(Integer.toOctalString(decimal));
        }

        return octal.toString();
    }
}
