import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to check whether it is prime or not? : ");
        int num = s.nextInt();

        boolean ans = prime(num);
        System.out.println(ans);
        s.close();
    }

    static boolean prime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}