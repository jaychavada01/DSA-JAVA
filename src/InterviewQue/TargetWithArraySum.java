public class TargetWithArraySum {
    public static void findTwoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("The two numbers are: " + nums[i] + " and " + nums[j]);
                    return;
                }
            }
        }
        System.out.println("Does not match for the target!");
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 18;
        findTwoSum(nums, target);
    }
}
