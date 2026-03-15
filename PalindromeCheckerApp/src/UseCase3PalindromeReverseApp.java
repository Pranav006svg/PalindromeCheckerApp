/**
 * =========================================================
 * MAIN CLASS - UseCase3PalindromeReverseApp
 * =========================================================
 *
 * Use Case 3: Palindrome Check Using String Reverse
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string using a loop and comparing
 * it with the original string.
 *
 * Key Concepts:
 * - For Loop
 * - String Immutability
 * - String Concatenation (+)
 * - equals() Method
 *
 * @author Developer
 * @version 3.0
 */

public class UseCase3PalindromeReverseApp {

    /**
     * Application entry point for UC3.
     *
     * @param args Command-Line arguments
     */
    public static void main(String[] args) {

        String original = "madam";
        String reversed = "";

        // Reverse string using loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare original and reversed string
        if (original.equals(reversed)) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }
    }
}