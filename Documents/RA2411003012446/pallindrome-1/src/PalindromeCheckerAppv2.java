import java.util.Scanner;
public class PalindromeCheckerAppv2 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check if it is a palindrome: ");
        String input = scanner.nextLine();
        boolean isPalindrome = true;


        String cleanedInput = input.toLowerCase();
        int length = cleanedInput.length();


        for (int i = 0; i < length / 2; i++) {

            if (cleanedInput.charAt(i) != cleanedInput.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }


        System.out.println("Input String: " + input);
        if (isPalindrome) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }
    }
}

