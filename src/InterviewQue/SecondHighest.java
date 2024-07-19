import java.util.Arrays;

public class SecondHighest {
    public static void main(String[] args) {
        int arr[] = {12,26,5,6,16,30};

        Arrays.sort(arr);
        
        System.out.println("Second highest element from array: "+arr[arr.length-2]);
    }
}