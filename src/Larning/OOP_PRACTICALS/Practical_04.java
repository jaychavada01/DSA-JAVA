package OOP_PRACTICALS;

import java.util.Scanner;

public class Practical_04 {
    public static void main(String[] args) {
        System.out.println("NAME : JAY CHAVADA \nENROLLMENT NO. 210210116006");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number you want to check:");
            int n = sc.nextInt();

            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not a prime number");
                    return;
                }
            }
            System.out.println(n + " is a prime number");
        }
    }
}