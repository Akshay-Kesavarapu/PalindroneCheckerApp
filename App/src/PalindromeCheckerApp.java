import java.util.Scanner;

/**
 * =======================================================
 * MAIN CLASS - UseCase4PalindromeCheckerApp
 * ======================================================
 *
 * Use Case 4: Character Array Based Validation
 *
 * Description:
 * This class validates a palindrome by converting
 * the string into a character array and comparing
 * characters using the two-pointer technique.
 *
 * At this stage, the application:
 * - Converts string into char array
 * - Uses start and end pointers
 * - Compares characters efficiently
 * - Displays the result
 *
 * This reduces extra memory usage.
 *
 * @author Developer
 * @version 1.0
 */
import java.util.Scanner;

public class PalindromeCheckerApp{
    /**
     * Application entry point for UC4.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "radar";
        char[] chars  = input.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome = true;
        while (start < end){
            if(chars[start] != chars[end]){
                isPalindrome = false;
            }
            start ++;
            end--;
        }
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : "+isPalindrome);
    }
}
