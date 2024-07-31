package Sorts;

/*
    * make last element pivot
    * element smaller than pivot will be on left side of pivot and larger than will be on right side
    * low = starting index of array
    * high = ending index of array
    * i = serving element for pivot comparison
*/
public class QuickSort {

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // taking pivot to it's original position
        i++; // will make space for pivot
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i; // pivot index
    }

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 5, 9, 2, 8, 1 };
        int n = arr.length;

        quickSort(arr, 0, n - 1);

        // print
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// time complexity: worst case: O(n^2), 
// avg: O(nlogn) : in this case every time pivot becomes smallest or largest element