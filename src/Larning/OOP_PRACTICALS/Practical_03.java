package OOP_PRACTICALS;

import java.util.Scanner;

public class Practical_03 {
    public static void main(String[] args) {
        System.out.println("NAME : JAY CHAVADA \nENROLLMENT NO. 210210116006");
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value for Base");
            int base = sc.nextInt();
            System.out.println("Enter the value for Exponent");
            int exponent = sc.nextInt();

            double result =Math.pow(base,exponent);
            System.out.println(result);
        }
    }
}