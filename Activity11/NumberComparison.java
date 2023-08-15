package Activity11;

import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first integer: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Input second integer: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber == secondNumber) {
            System.out.println(firstNumber + " == " + secondNumber);
        } else {
            System.out.println(firstNumber + " != " + secondNumber);
            if (firstNumber < secondNumber) {
                System.out.println(firstNumber + " < " + secondNumber);
                System.out.println(firstNumber + " <= " + secondNumber);
            } else {
                System.out.println(firstNumber + " > " + secondNumber);
                System.out.println(firstNumber + " >= " + secondNumber);
            }
        }

        scanner.close();
    }
}
