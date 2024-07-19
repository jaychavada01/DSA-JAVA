import java.util.Scanner;

public class Search_in_range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = { 10, 20, 30, 60, -90, -33, -2, 45, 96 };
        System.out.print("Enter the target number:");
        int target = sc.nextInt();
        System.out.println("Element at index "+linearSearch(nums, target, 1, 4));
        sc.close();
    }

    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        // if element is nor exist
        System.out.println("Element is not found!");
        return -1;
    }
}
