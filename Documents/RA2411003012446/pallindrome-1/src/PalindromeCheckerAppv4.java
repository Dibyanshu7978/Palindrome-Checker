import java.util.Scanner;

public class PalindromeCheckerAppv4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string for Character Array validation: ");
        String input = scanner.nextLine();

        // 1. Convert string to char[] for index-based access
        char[] charArray = input.toLowerCase().toCharArray();

        // 2. Use two-pointer approach
        int left = 0;                  // Start pointer
        int right = charArray.length - 1; // End pointer
        boolean isPalindrome = true;

        // 3. Compare start & end characters
        while (left < right) {
            if (charArray[left] != charArray[right]) {
                isPalindrome = false;
                break; // Exit early if mismatch found
            }
            left++;  // Move forward
            right--; // Move backward
        }

        // Display results
        System.out.println("---------------------------------");
        System.out.println("Character Array: " + java.util.Arrays.toString(charArray));
        if (isPalindrome) {
            System.out.println("Result: Valid Palindrome (UC4)");
        } else {
            System.out.println("Result: Not a Palindrome (UC4)");
        }

        scanner.close();
    }
}
