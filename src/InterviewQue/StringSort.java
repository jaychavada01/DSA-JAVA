import java.util.Arrays;
import java.util.Scanner;

public class StringSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string:");

        String input = scanner.nextLine();

        char[] charArray = input.toCharArray();
        Arrays.sort(charArray);

        String sortedString = new String(charArray);
        System.out.println("Sorted string: " + sortedString);
        scanner.close();
    }
}