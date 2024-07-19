import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;

        // taking input from user till user press X or x
        while (true) {
            // taking character as input
            System.out.print("Enter the Operator: ");
            char operator = sc.next().trim().charAt(0);
            if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {
                // taking two number inputs
                System.out.println("Enter Number1 :");
                int num1 = sc.nextInt();
                System.out.println("Enter Number2 :");
                int num2 = sc.nextInt();

                if (operator == '+') {
                    ans = num1 + num2;
                }
                if (operator == '-') {
                    ans = num1 - num2;
                }
                if (operator == '*') {
                    ans = num1 * num2;
                }
                if (operator == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (operator == '%') {
                    ans = num1 % num2;
                }
            } else if (operator == 'x' || operator == 'X') {
                System.out.println("Program termiates!!");
                break;
            } else {
                System.out.println("Invalid Operation!!");
            }
            System.out.println("Answer is: "+ans);
        }
        sc.close();
    }
}
