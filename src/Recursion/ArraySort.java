package Recursion;

public class ArraySort {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 88, 9, 10, 11, 12 };
        System.out.println(isSorted(arr, 0));
    }

    static boolean isSorted(int[] array, int index) {
        if (index == array.length - 1) {
            return true;
        }
        return array[index] < array[index + 1] && isSorted(array, index + 1);
    }
}
