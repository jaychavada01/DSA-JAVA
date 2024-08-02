package Sorts;

import java.util.*;

/*
    * make last element pivot
    * element smaller than pivot will be on left side of pivot and larger than will be on right side
    * low = starting index of array
    * high = ending index of array
    * i = serving element for pivot comparison
*/
public class QuickSort {

    static int partition(List<Integer> arr, int low, int high) {
        int pivot = arr.get(low);
        int i = low;
        int j = high;

        while (i < j) {
            while (arr.get(i) <= pivot && i <= high - 1) {
                i++;
            }

            while (arr.get(j) > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        int temp = arr.get(low);
        arr.set(low, arr.get(j));
        arr.set(j, temp);
        return j;
    }

    static void qs(List<Integer> arr, int low, int high) {
        if (low < high) {
            int pIndex = partition(arr, low, high);
            qs(arr, low, pIndex - 1);
            qs(arr, pIndex + 1, high);
        }
    }

    public static List<Integer> quickSort(List<Integer> arr) {
        qs(arr, 0, arr.size() - 1);
        return arr;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr = Arrays.asList(new Integer[] { 4, 6, 2, 5, 7, 9, 1, 3 });
        int n = arr.size();

        System.out.println("Before Using Quick Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        
        arr = quickSort(arr);
        System.out.println("After Quick sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }
}

// time complexity: worst case: O(n^2),
// avg: O(nlogn) : in this case every time pivot becomes smallest or largest
// element