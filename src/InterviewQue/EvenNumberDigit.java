// find numbers with even number of digits

public class EvenNumberDigit {
    public static void main(String[] args) {
        int[] nums = { 12, 26, 6, 95, 35 };
        System.out.println("Even number of digits are: " + findNumbers(nums));
        System.out.println("Number of digits is: " + digits(-65649));
        System.out.println(digits2(-7979));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    // checking whether numbers contains even digits or not
    static boolean even(int num) {
        int numberOfDigits = digits(num);
        if (numberOfDigits % 2 == 0) {
            return true;
        }
        return false;
    }

    static int digits(int num) {
        if (num < 0) {
            num = num * -1;
        }
        if (num == 1) {
            return 1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    // another way to count digits
    static int digits2(int num) {
        if (num < 0) {
            num = num * -1;
        }
        return (int) (Math.log10(num)) + 1;
    }
}
