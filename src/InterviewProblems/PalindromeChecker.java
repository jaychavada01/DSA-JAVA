package InterviewProblems;
import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println("Is the string a palindrome? => " + isStringPalindrome(str));
        System.out.println("Is the number a palindrome? => " + isNumberPalindrome(num));

        scanner.close();
    }

    public static boolean isStringPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            char ch1 = str.charAt(start);
            char ch2 = str.charAt(end);

            // Ignore case sensitivity (optional)
            if (Character.toLowerCase(ch1) != Character.toLowerCase(ch2)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static boolean isNumberPalindrome(int num) {
        if (num < 0) {
            return false; // Negative numbers are not palindromes
        }

        int reversedNum = 0;
        int originalNum = num;

        while (num > 0) {
            int lastDigit = num % 10;
            reversedNum = reversedNum * 10 + lastDigit;
            num = num/10;
        }

        return originalNum == reversedNum;
    }
}