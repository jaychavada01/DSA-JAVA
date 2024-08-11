package InterviewProblems;

public class ArmstrongNumber {

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int result = 0;
        int numberOfDigits = String.valueOf(number).length();

        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            result += Math.pow(digit, numberOfDigits);
            originalNumber /= 10;
        }
        return result == number;
    }

    // Method to print all Armstrong numbers between 1 and 100
    public static void print() {
        System.out.println("Armstrong numbers between 1 and 100 are:");
        for (int i = 1; i <= 100; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        // Checking a specific number if it is an Armstrong number
        int number = 153;
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        // Printing all Armstrong numbers between 1 and 100
        print();
    }
}
