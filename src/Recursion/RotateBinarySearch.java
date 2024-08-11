package Recursion;

public class RotateBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3,4};
        System.out.println(search(arr, 4, 0, arr.length-1));
    }

    static int search(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }

        // case 1 : left sorted part
        if (arr[start] <= arr[mid]) {
            if (target >= arr[start] && target <= arr[mid]) {
                return search(arr, target, start, mid - 1);
            } else {
                return search(arr, target, mid + 1, end);
            }
        }

        // case 2 : right sorted part
        if (target >= arr[mid] && target <= arr[end]) {
            return search(arr, target, mid + 1, end);
        }

        // case 3
        return search(arr, target, start, mid - 1);
    }
}
