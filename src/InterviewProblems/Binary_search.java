package InterviewProblems;
// TimeComplexity is O(logn).

public class Binary_search {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
        int target = 5;

        int result = binarySearch(nums, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Could not find element");
        }
    }

    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int steps = 0;

        while (left <= right) {
            steps++;
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                System.out.println("Steps taken by binary search: " + steps);
                return mid; // mid is nothing but the index of the target element
            } else if (nums[mid] < target) {
                // shifting left
                left = mid + 1;
            } else {
                // shifting right
                right = mid - 1;
            }
        }
        System.out.println("Steps taken by Binary search: " + steps);
        return -1;
    }
}
