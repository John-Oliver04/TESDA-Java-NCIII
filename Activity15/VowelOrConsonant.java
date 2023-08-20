package Activity15;
import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a single character
        System.out.print("Input an alphabet: ");
        String input = scanner.nextLine();

        scanner.close();

        // Check if the input is a single character
        if (input.length() == 1) {
            char ch = input.charAt(0);

            // Check if the input is a letter (between 'a' and 'z' or 'A' and 'Z')
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                // Convert the character to lowercase for easier vowel checking
                char lowercaseChar = Character.toLowerCase(ch);

                // Check if the character is a vowel
                if (lowercaseChar == 'a' || lowercaseChar == 'e' || lowercaseChar == 'i'
                        || lowercaseChar == 'o' || lowercaseChar == 'u') {
                    System.out.println("Input letter is Vowel");
                } else {
                    System.out.println("Input letter is Consonant");
                }
            } else {
                System.out.println("Error: Input is not a letter.");
            }
        } else {
            System.out.println("Error: Input is not a single character.");
        }
    }
}
