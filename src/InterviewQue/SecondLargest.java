import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {12,26,5,6,16,30};

        Arrays.sort(arr);
        
        System.out.println("Second largest element from array: "+arr[arr.length-2]);
        System.out.println("Third largest element from array: "+arr[arr.length-3]);
        System.out.println("Fourth largest element from array: "+arr[arr.length-4]);
    }
}