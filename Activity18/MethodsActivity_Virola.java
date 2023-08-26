package Activity18;

public class MethodsActivity_Virola {

    // Method to identify if a number is odd or even
    public static void isOddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }

    // Method to print your name 50 times
    public static void printName50Times(String name) {
        for (int i = 0; i < 50; i++) {
            System.out.println(name);
        }
    }

    // Method to get the square root of a number
    public static void squareRoot(double number) {
        System.out.println("Sqrt of " +number + " = " + Math.sqrt(number));
    }

    // Method to calculate the power of a number
    public static void thePower(double base, double exponent) {
        System.out.println("base " +base + " exponent " +exponent + " = " +  Math.pow(base, exponent));
    }

    // Method to print a random number between 1 and 100
    public static void printRandomNumber() {
        int randomNumber = (int) (Math.random() * 100) + 1;
        System.out.println("Random Number(1-100): " + randomNumber);
    }

    // Method to calculate the area of a circle
    public static void circleArea(double radius) {
        System.out.println("Circle area of "+radius+" is : "+Math.PI * Math.pow(radius, 2));
    }

    // Method to identify if a person is a voter
    public static void isVoter(int age) {
        if (age >= 18) {
            System.out.println(age+" : You are eligible to vote.");
        } else {
            System.out.println(age+" : You are not eligible to vote.");
        }
    }

    // Method to get the length of a word
    public static void wordLength(String word) {
        System.out.println("The length of " + word + " is " + word.length());
    }

    // Method to print a word in reverse order
    public static void reverseWord(String word) {
        StringBuilder reversed = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed.append(word.charAt(i));
        }
        System.out.println("Reversed Word: " + reversed.toString());
    }

    // Method to print your full name and age
    public static void printFullNameAndAge(String fullName, int age) {
        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // You can call and test these methods in the main method if needed.
        System.out.println("a method to identify if a number is odd or even");
        isOddOrEven(7);

        System.out.println("a method to print your name 50 times");
        printName50Times("John Oliver");

        System.out.println(" a method to get the square root of a certain variable");
        squareRoot(16);

        System.out.println("a method to get the power of a number using base and exponent");
        thePower(2,3);

        System.out.println("a method to print a random number between 1 and 100");
        printRandomNumber();

        System.out.println(" a method to get the area of a circle using the given radius");
        circleArea(5);

        System.out.println("a method to identify if a person is a voter or not");
        isVoter(18);

        System.out.println("a method to get the length of a certain word");
        wordLength("John Oliver");

        System.out.println("a method to print a certain word in reverse order");
        reverseWord("John Oliver");

        System.out.println("a method to print your full name and age");
        printFullNameAndAge("John Oliver Virola", 20);
    }
}

