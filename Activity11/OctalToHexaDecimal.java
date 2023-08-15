package Activity11;

import java.util.Scanner;

public class OctalToHexaDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input an Octal Number: ");
        String octalNumberStr = scanner.nextLine();

        String hexNumber = convertOctalToHexadecimal(octalNumberStr);

        System.out.println("Equivalent Hexadecimal Number: " + hexNumber);

        scanner.close();
    }

    public static String convertOctalToHexadecimal(String octal) {
        StringBuilder hex = new StringBuilder();

        // Padding the octal string with zeros if its length is not a multiple of 3
        while (octal.length() % 3 != 0) {
            octal = "0" + octal;
        }

        // Converting groups of 3 octal digits at a time to hexadecimal
        for (int i = 0; i < octal.length(); i += 3) {
            String group = octal.substring(i, i + 3);
            int decimal = Integer.parseInt(group, 8);
            hex.append(Integer.toHexString(decimal).toUpperCase());
        }

        return hex.toString();
    }
}

