package InterviewProblems;
import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Value of a: ");
        int a = in.nextInt();
        System.out.println("Enter Value of b: ");
        int b = in.nextInt();
        System.out.println("Enter Value of C: ");
        int c = in.nextInt();

        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        System.out.println("Maximum Value is: " + max);

        in.close();
    }
}
