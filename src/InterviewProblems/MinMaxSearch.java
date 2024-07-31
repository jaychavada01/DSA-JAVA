package InterviewProblems;
public class MinMaxSearch {
    public static void main(String[] args) {
        int[] nums = { 10, 20, 30, 60, -90, -33, -2, 45, 96 };
        System.out.println("Minimum Value is: "+min(nums));
        System.out.println("Maximum Value is: "+max(nums));
    }

    static int min(int[] numbers) {
        int ans = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < ans) {
                ans = numbers[i];
            }
        }
        return ans;
    }
    static int max(int[] numbers) {
        int ans = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > ans) {
                ans = numbers[i];
            }
        }
        return ans;
    }
}
