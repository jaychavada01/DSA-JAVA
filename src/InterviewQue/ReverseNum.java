import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number you want to reverse: ");
        int n = sc.nextInt();

        int ans = 0;

        while (n > 0) {
            int remainder = n % 10;
            n /= 10;

            // to reverse printing
            ans = ans * 10 + remainder;
        }

        System.out.println("Reversed Number: " + ans);
        sc.close();
    }
}
