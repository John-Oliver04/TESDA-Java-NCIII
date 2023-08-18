package Activity14;
import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: ");
        double number = scanner.nextInt();

        if (number == 0) {
            System.out.println("Number is Zero :|");
        } else if (number > 0) {
            System.out.print("Number is Positive :)");
        } else {
            System.out.print("Number is Negative :(");
        }

        scanner.close();
    }
}
