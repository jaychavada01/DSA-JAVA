import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {12,26,5,6,16,30};

        Arrays.sort(arr);
        
        System.out.println("Second largest element from array: "+arr[arr.length-2]);
    }
}