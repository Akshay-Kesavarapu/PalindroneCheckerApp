import java.util.Scanner;

/**
 * =======================================================
 * MAIN CLASS - UseCase2PalindromeCheckerApp
 * ======================================================
 *
 * Use Case 1: Hardcoded Palindrome Validation
 *
 * Description:
 * This class demonstrates basic palindrome validation
 * using a hardcoded string value.
 *
 * At this stage, the application:
 * - Starts a predefined string
 * - Compares characters from both ends
 * - Determines whether the string is a palindrome
 * - Displays the result on the console
 *
 * This use case introduces fundamental comparison logic
 * before using advanced data structures.
 *
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
        boolean isPalindrome = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input text: ");
        String input = sc.nextLine();
        for (int i = 0; i < input.length() / 2; i++) {
            if(input.charAt(i) != input.charAt(input.length() - i -1)){
                isPalindrome = false;
                break;
            }
        }
            System.out.println("Is it Palindrome?: " + isPalindrome);
    }
}
