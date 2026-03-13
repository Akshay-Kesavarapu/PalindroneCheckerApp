import java.util.*;

/**
 * =======================================================
 * MAIN CLASS - UseCase8PalindromeCheckerApp
 * ======================================================
 *
 * Use Case 8: Linked List Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * using a linked list.
 *
 * Characters are added to the list and then
 * compared by removing elements from both ends:
 *
 * - removeFirst()
 * - removeLast()
 *
 * This demonstrates how the LinkedList supports
 * double-ended operations for symmetric validation.
 *
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
      String input = "level";
      LinkedList<Character> list = new LinkedList();
      for (char c : input.toCharArray()) {
          list.add(c);
      }
      boolean isPalindrome = true;
      while (list.size() > 1) {
          if (list.removeFirst() != list.removeLast()) {
              isPalindrome = false;
              break;
          }
      }
      System.out.println("Input : " + input);
      System.out.println("Is Palindrome? : "+isPalindrome);
    }
}
