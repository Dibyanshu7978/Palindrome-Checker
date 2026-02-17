import java.util.Scanner;
public class PalindromeCheckerApp3 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string to reverse check: ");
        String original = scanner.nextLine();

        // We will build the reversed string here
        String reversed = "";

        // Hint implementation: Iterate from the last character to the first
        for (int i = original.length() - 1; i >= 0; i--) {
            // Append each character to our 'reversed' string variable
            reversed += original.charAt(i);
        }

        // Display transformation results
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);

        // Perform comparison
        if (original.equalsIgnoreCase(reversed)) {
            System.out.println("Result: Success! The string is a palindrome.");
        } else {
            System.out.println("Result: Failed. The string is NOT a palindrome.");
        }

        scanner.close();
    }
}