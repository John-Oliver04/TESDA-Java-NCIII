package Activity15;

public class NaturalNumber {
    public static void main(String[] args) {
        System.out.print("The first 10 natural numbers are: ");

        for (int i = 1; i <= 10; i++) {
            System.out.print(i);

            // Add a comma and space after each number except the last one
            if (i < 10) {
                System.out.print(", ");
            }
        }

        System.out.println(); // Print a new line for better formatting
    }
}

