package OOP_PRACTICALS;

import java.util.Scanner;

public class Practical_10 {
    // public static int fibb1(int n) {
    // if (n == 0 || n == 1)
    // return n;
    // else {
    // int x = fibb1(n - 1) + fibb1(n - 2);
    // return x;
    // }
    // }

    public static void main(String[] args) {
        System.out.println("NAME : JAY CHAVADA \nENROLLMENT NO. 210210116006");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of Fibonacci numbers to generate: ");
            int n = sc.nextInt();

            int a = 0;
            int b = 1;

            System.out.print(a + " " + b);

            for (int i = 2; i < n; i++) {
                int c = a + b;
                System.out.print(" " + c);
                
                a = b;
                b = c;
            }
            // int fibonacci_len = 15;
            // System.out.println("NAME : JAY CHAVADA \nENROLLMENT NO. 210210116006");
            // System.out.print("Fibonacci Series of " + fibonacci_len + " numbers is: \n");
        }

        // for (int i = 0; i <= fibonacci_len; i++) {
        // System.out.print(fibb1(i) + " ");
        // }
    }
}