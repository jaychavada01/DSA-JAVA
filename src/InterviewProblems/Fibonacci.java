package InterviewProblems;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        int n = scanner.nextInt();

        // Print the Fibonacci sequence
        System.out.print("Fibonacci Series with recursion : ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        
        fibbo(n);
        scanner.close();
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void fibbo(int n) {
        if (n <= 0) {
            System.out.println("Invalid number");
            return;
        }

        int first = 0;
        int second = 1;

        System.out.println();
        System.out.print("Fibonacci without recursion: " + first);

        for (int i = 1; i < n; i++) {
            System.out.print(" " + second);
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
