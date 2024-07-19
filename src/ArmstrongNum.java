import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to check whether it is Armstrong or not? :");
        int num = s.nextInt();

        System.out.print(isArmstrong(num));
        s.close();

        // armstrong numbers between 1000
        /*
         * for (int i = 100; i < 1000; i++) {
         * if (isArmstrong(i)) {
         * System.out.print(i + " ");
         * }
         * }
         */
    }

    static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;
        while (num > 0) {
            int remainder = num % 10;
            num = num / 10;
            sum = sum + remainder * remainder * remainder;
        }
        if (sum == original) {
            return true;
        } else {
            return false;
        }
    }
}
