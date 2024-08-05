package InterviewProblems;

public class N_N_factorialSum {

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 8;
        float sum = 0.0f;

        for (int i = 1; i <= n; i++) {
            sum += (float) i / factorial(i);
        }
        System.out.println("Sum of " + n + " number is: " + sum);
    }
}
