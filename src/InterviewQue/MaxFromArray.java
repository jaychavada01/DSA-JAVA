public class MaxFromArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,66,99,85,16,1173};
        System.out.println("Max Value is: "+max(arr));
        System.out.println("Max Value from Range is: "+maxRange(arr, 6, 7));
    }
    // worked on edge cases
    static int maxRange(int[] arr, int start, int end){
        int maxval = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxval) {
                maxval = arr[i];
            }
        }
        return maxval;
    }

    // worked on array
    static int max(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
