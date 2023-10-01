import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Type a word or stop to exit: ");
            String input = scanner.nextLine();

            if (input.equals("stop")) {
                break;
            } else {
                palindromeCheck(input);
            }
        }
    }
    public static void palindromeCheck(String word) {
            char char0 = word.charAt(0);
            if (char0 == word.charAt(word.length() - 1)) {
                System.out.println("True, this word is a palindrome!");
            } else {
                System.out.println("False, this word is not a palindrome.");
            }
    }
}