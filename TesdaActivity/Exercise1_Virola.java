package TesdaActivity;

import java.lang.Long;

public class Exercise1_Virola {
    public static void main(String[] args) {
        long number = 38710815121118L;

//          1. Replace all 8s to 0
        Long replacedNumber = replacedEightWithZero(number);
        System.out.println(replacedNumber);

//          2. find the index of the last digit
//         converting the number to a string value by using toString
        String convertedString = Long.toString(number);
//         finding the last index of the character '1' by using lastIndexOf --> remember that the counting is starts with sero not one
        int lastIndexOfOne = convertedString.lastIndexOf('1');
        System.out.println(lastIndexOfOne);

//        3. Insert whitespaces between each character
//        Convert the number to a string and insert spaces between characters using our created function - > insertSpacesIntoNumber()
        String spacedNumber = insertSpacesIntoNumber(number);
        System.out.println(spacedNumber);

//        4. Increment each Character once and return as String
//         Increment each character and return the result as a string
        String incrementedNumber = incrementNumber(number);
        System.out.println(incrementedNumber);

//        5. Print the value in reverse position by only using String methods.
//         Print the value in reverse position using String methods and StringBuilder class
        String reversedNumber = reverseString(convertedString);
        System.out.println(reversedNumber);


//        // Print the value in reverse position without using StringBuilder
//        String reversedNumber2 = reverseStringWithoutStringBuilder(convertedString);
//        System.out.println(reversedNumber2);

    }


    //        function for replacing 8 to zero
    private static Long replacedEightWithZero(long number) {

        long replacedResult = 0;
        long multiplyBy = 1;

        while (number > 0) {
//          "number divided with result of remainder which is the end of the current digit: "
            long d = number % 10;

//          check if the current value of d is 8
            if (d == 8) {
//              "if the direct digit is equal to 8 then the current value will changed to zero by declaring new value."
                d = 0;
            }
//          pass the value by tens into replacedResult by multiplying d and multiplyBy variable the divide the number into 10
//          first value is 8  converted to 0 --> 0 x 1 = 0
            replacedResult += d * multiplyBy;
//          multiply 1 x 10 = 10
            multiplyBy *= 10;
//          Divide number variable into 10 to reduce and erase the last digit of variable number
            number /= 10;
        }

        return replacedResult;
    }


    //     Function for inserting spaces between each character
    public static String insertSpacesIntoNumber(long num) {
//        convert it to string by using toString function
        String convertedString = Long.toString(num);
//        split the converted string by using Split function
//        join the converted String by using join function then return with string value with final result of whitespaces of each character
        return String.join(" ", convertedString.split(""));
    }


    //     Function to increment each character in a number by 1 and return the result as a string
    public static String incrementNumber(long num) {
//        convert long number into string by using toString
        String convertedString = Long.toString(num);
//      to modify the string without creating new objects --> .append .replace .insert .toString and others.
        StringBuilder result = new StringBuilder();

//        foor loop with length of convertedString to get the current number of character
        for (int i = 0; i < convertedString.length(); i++) {
//            to get the current character
            char currentChar = convertedString.charAt(i);
//            to increment to change the current character
            char incrementedChar = (char) (currentChar + 1);

//            append or add it or compile it to the "-result- StringBuilder Class" by using .append
            result.append(incrementedChar);
        }

//        returning string of value of result by using return and .toString
        return result.toString();
    }


    //     Function to reverse a string using String methods
    public static String reverseString(String input) {
//      to easy manipulate string without creating new objects  --> .append .replace .insert .toString and others. but for now is " .reverse() "
        StringBuilder reversed = new StringBuilder(input);
//        returning value with an output of reverse string
        return reversed.reverse().toString();
    }


// paste it to main if you want to use the reverse reverseStringWithoutStringBuilder() function
    //     Print the value in reverse position without using StringBuilder
    //    String reversedNumber = reverseStringWithoutStringBuilder(numberStr);
    //    System.out.println(reversedNumber);
    //

    // Function to reverse a string without using StringBuilder
    public static String reverseStringWithoutStringBuilder(String input) {
        char[] chars = input.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            // Swap characters at positions left and right
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            // Move the pointers towards each other  like   ---> <---   |   --> <--   |   -><-
            left++;
            right--;
        }

        return new String(chars);
    }
}

