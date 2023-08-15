package Activity11;

import java.util.Scanner;

public class BinaryToHexaDecimal {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Input a Binary Number: ");
            String binaryNumberStr = scanner.nextLine();

            String hexValue = convertBinaryToHexadecimal(binaryNumberStr);

            System.out.println("Hexadecimal value: " + hexValue);

            scanner.close();
        }

        public static String convertBinaryToHexadecimal(String binary) {
            StringBuilder hexValue = new StringBuilder();

            // Padding the binary string with zeros if its length is not a multiple of 4
            while (binary.length() % 4 != 0) {
                binary = "0" + binary;
            }

            // Converting groups of 4 bits at a time to hexadecimal
            for (int i = 0; i < binary.length(); i += 4) {
                String group = binary.substring(i, i + 4);
                int decimal = Integer.parseInt(group, 2);
                hexValue.append(Integer.toHexString(decimal).toUpperCase());
            }

            return hexValue.toString();
        }

}
