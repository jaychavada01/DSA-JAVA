package Recursion;

import java.util.Arrays;

public class StriverRecursion {
    public static void main(String[] args) {
        int n = 5;

        printname(1, n);
        System.out.println();

        printNum(1, n);
        System.out.println();

        printNumReverse(1, n);
        System.out.println();

        sumOfN(n);

        System.out.println("Factorial of " + n + " is: " + factorial(n));

        int arr[] = { 5, 4, 3, 2, 1 };
        System.out.println(Arrays.toString(arr));
        reverseArray(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));

        System.out.println("Palindrome string checking: ");
        String str = "radar";
        System.out.println(palinString(str, 0, str.length() - 1));

        System.out.println("Fibonacci: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibbonaci(i) + " ");
        }
    }

    private static void printname(int i, int n) {
        if (i > n)
            return;

        System.out.print("Jaychavda ");
        printname(i + 1, n);
    }

    private static void printNum(int i, int n) {
        if (i > n)
            return;

        System.out.print(i + " ");
        printNum(i + 1, n);
    }

    private static void printNumReverse(int i, int n) {
        if (i > n)
            return;

        printNumReverse(i + 1, n);
        System.out.print(i + " ");
    }

    private static void sumOfN(int n) {
        // int sum = 0;
        // for (int i = 1; i <= n; i++) {
        // sum += i;
        // }
        int sum = n * (n + 1) / 2;
        System.out.println("Sum of first " + n + " number " + sum);
    }

    private static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    private static void reverseArray(int[] arr, int start, int end) {
        if (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverseArray(arr, start + 1, end - 1);
        }
    }

    private static boolean palinString(String str, int start, int end) {
        if (start >= end) {
            return true;
        }

        char ch1 = str.charAt(start);
        char ch2 = str.charAt(end);

        if (Character.isLowerCase(ch1) != Character.isLowerCase(ch2)) {
            return false;
        }

        return palinString(str, start + 1, end - 1);
    }

    private static int fibbonaci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibbonaci(n - 1) + fibbonaci(n - 2);
        }
    }
}
