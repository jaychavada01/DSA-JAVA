package InterviewProblems;
public class MaxFromArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,66,99,85,16,1173};
        System.out.println("Max Value is: "+max(arr));
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
