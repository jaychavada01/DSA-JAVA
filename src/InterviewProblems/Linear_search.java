package InterviewProblems;
// TimeComplaxity is: O(n)

public class Linear_search {
    public static void main(String[] args) {
        int[] nums = { 10, 20, 30, 60, -90, -33, -2, 45, 96 };
        int target = 30;
        System.out.println(linearSearch(nums, target));

        // Searching in string
        // String name = "Mahadev";
        // char target2 = 'h';
        // System.out.println(searchstring(name, target2));
    }

    // searching in array return index if item found otherwise return -1
    static int linearSearch(int[] arr, int target) {
        int steps = 0;
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            steps++;
            // returning index if item is found
            int element = arr[index];
            if (element == target) {
                System.out.println("Steps taken by Linear Search is: "+steps);
                System.out.print("Target Element found at index: ");
                return index;
            }
        }
        System.out.println("Steps taken by Linear Search is: "+steps);
        // if element is not exist
        System.out.println("Element is not found!");
        return -1;
    }

    // searching element in string
    // static boolean searchstring(String str, char target2) {
    //     if (str.length() == 0) {
    //         return false;
    //     }

    //     for (int i = 0; i < str.length(); i++) {
    //         if (target2 == str.charAt(i)) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }
}
