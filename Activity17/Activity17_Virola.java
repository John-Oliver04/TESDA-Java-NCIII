package Activity17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Activity17_Virola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> bingoBalls = new ArrayList<>();

        // Generate BINGO balls
        for (int i = 1; i <= 75; i++) {
            bingoBalls.add(i);
        }

        // Shuffle the BINGO balls
        Collections.shuffle(bingoBalls);

        System.out.println("Welcome to the B I N G O !");
        System.out.println("Enter (q to quit).");

        while (!bingoBalls.isEmpty()) {
            System.out.print("Press Enter to call the next number...");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            int calledNumber = bingoBalls.remove(0);

            // Determine the letter based on the range
            String letter;
            if (calledNumber >= 1 && calledNumber <= 15) {
                letter = "B";
            } else if (calledNumber >= 16 && calledNumber <= 30) {
                letter = "I";
            } else if (calledNumber >= 31 && calledNumber <= 45) {
                letter = "N";
            } else if (calledNumber >= 46 && calledNumber <= 60) {
                letter = "G";
            } else {
                letter = "O";
            }

            // Output the called number and corresponding letter
            System.out.println(letter + " : " + calledNumber);
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
