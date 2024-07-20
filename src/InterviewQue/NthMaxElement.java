import java.util.Arrays;
import java.util.Scanner;

public class NthMaxElement {
    public static int findNthMax(int[] arr, int n) {
        if (n > arr.length) {
            throw new IllegalArgumentException("n cannot be greater than array length");
        }

        for (int i = 0; i < n; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Swap the maximum element with the current index
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
        return arr[n - 1];
    }

    public static void main(String[] args) {
        int[] arr = { 12, 35, 9, 42, 15, 7, 13, 2, 0, 11 };
        Arrays.sort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of index : ");
        int n = sc.nextInt();
        int nthMax = findNthMax(arr, n);
        System.out.println(n + "th maximum value is: " + nthMax);
        sc.close();
    }
}