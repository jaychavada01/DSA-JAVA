public class MinMaxValue {
    public static void main(String[] args) {
        int arr[] = { 12, 26, 5, 6, 16, 30 };

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if(num > largest){
                largest = num;
            }
            else if(num < smallest){
                smallest = num;
            }
        }

        System.out.println("Largest number from Array: " + largest);
        System.out.println("Smallest number from Array: " + smallest);
    }
}
