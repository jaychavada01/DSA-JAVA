package OOP_PRACTICALS;

import java.util.Scanner;

public class Practical_02 {
    public static void main(String[] args) {
        System.out.println("NAME : JAY CHAVADA \nENROLLMENT NO. 210210116006");

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the number:");
            int i = sc.nextInt();

            if(i%2 ==0){
                System.out.println("Even");
            }
            else 
            System.out.println("odd");
        }
    }
}