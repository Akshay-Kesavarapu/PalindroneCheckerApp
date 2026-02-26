import java.util.Scanner;

/**
 * =======================================================
 * MAIN CLASS - UseCase3PalindromeCheckerApp
 * ======================================================
 *
 * Use Case 3: Reverse String Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a Palindrome
 * by reversing the string and comparing it with
 * the original value.
 *
 * At this stage, the application:
 * - Iterates the string in reverse order
 * - Builds a reversed version
 * - Compares original and reversed strings
 * - Displays the validation result
 *
 * This introduces transformation-based validation.
 *
 * @author Developer
 * @version 1.0
 */
import java.util.Scanner;

public class PalindromeCheckerApp{
    /**
     * Application entry point for UC2.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String reverse = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Input text: ");
        String input = sc.nextLine();
        for (int i = input.length()-1; i >= 0; i--) {
            reverse += input.charAt(i);
        }
        if (reverse.equals(input))
            System.out.println("Is it Palindrome?: " + true);
        else
            System.out.println("Is it Palindrome?: " + false);
    }
}
