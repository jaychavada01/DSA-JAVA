import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 23, 33, 56 },
                { 18, 85, 96, 32 },
                { 17, 15 }
        };
        int target = 32;
        // format of return value {row,col}
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] { row, col };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] in : arr) {
            for (int element : in) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}
