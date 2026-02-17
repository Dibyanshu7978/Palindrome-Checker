import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerAppv5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string for UC5 (Stack): ");
        String input = scanner.nextLine();

        Stack<Character> stack = new Stack<>();

        // 1. Push characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // 2. Pop and compare
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop()); // Removes characters in reverse order
        }

        // 3. Print result
        if (input.equals(reversed.toString())) {
            System.out.println("Result: Success! Palindrome validated via Stack.");
        } else {
            System.out.println("Result: Failed. Not a palindrome.");
        }

        scanner.close();
    }
}