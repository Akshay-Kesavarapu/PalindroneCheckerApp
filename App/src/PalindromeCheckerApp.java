import java.util.*;

/**
 * =======================================================
 * MAIN CLASS - UseCase7PalindromeCheckerApp
 * ======================================================
 *
 * Use Case 7: Deqye Based Palindrome Check
 *
 * Description:
 * This class validates a palindrome using a Deque
 * (double ended queue).
 *
 * Characters are inserted into the deque and then
 * compared by removing elements from both ends:
 *
 * - removeFirst()
 * - removeLast()
 *
 * This avoids reversing the string and previous an
 * efficient front-to-back comparison approach.
 *
 * This use case demonstrates optimal bidirectional
 * traversal using Deque.
 *
 * @author Developer
 * @version 7.0
 */
import java.util.Scanner;

public class PalindromeCheckerApp{
    /**
     * Application entry point for UC6.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
      String input = "refer";
      Deque<Character> deque = new ArrayDeque<>();
      for (char c : input.toCharArray()) {
          deque.push(c);
      }
        boolean isPalindrome = true;
      while (deque.size() > 1) {
          if(deque.removeFirst() != deque.removeLast()) {
              isPalindrome = false;
          }
      }
      System.out.println("Input : " + input);
      System.out.println("Is Palindrome? : "+isPalindrome);
    }
}
