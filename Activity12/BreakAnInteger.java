package Activity12;

import java.util.Scanner;

public class BreakAnInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input six non-negative digits: ");
        int number = scanner.nextInt();

        if (number < 0 || number > 999999) {
            System.out.println("Please enter a valid six-digit non-negative number.");
            scanner.close();
            return;
        }

        int[] digits = new int[6];

        for (int i = 5; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }

        for (int digit : digits) {
            System.out.print(digit + " ");
        }

        scanner.close();
    }
}
