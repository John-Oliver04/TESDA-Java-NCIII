package Activity13;
import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age > 12) {
            System.out.println("Adult.");
        } else if (age <= 12 && age > 0) {
            System.out.println("Child.");
        } else {
            System.out.println("Infant.");
        }

        scanner.close();
    }
}
