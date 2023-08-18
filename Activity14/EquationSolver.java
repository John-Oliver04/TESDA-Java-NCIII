package Activity14;
import java.util.Scanner;

public class EquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a: ");
        double a = scanner.nextDouble();

        System.out.print("Input b: ");
        double b = scanner.nextDouble();

        System.out.print("Input c: ");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;
//        21.0
//        4.58257569495584
//        -0.41742430504416017
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("The root is " + root);
        } else {
            System.out.println("The equation has complex roots.");
        }

        scanner.close();
    }
}
