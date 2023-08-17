package Activity12;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input an integer between 0 and 1000: :) ");
        int number = scanner.nextInt();

        if (number < 0 || number > 1000) {
            System.out.println("Input out of range. Please enter an integer between 0 and 1000. :(");
            scanner.close();
            return;
        }

        int sum = 0;
        int originalNumber = number;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        System.out.println("The sum of all digits in " + originalNumber + " is " + sum);

        scanner.close();
    }
}
