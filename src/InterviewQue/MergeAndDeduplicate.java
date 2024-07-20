import java.util.Arrays;

public class MergeAndDeduplicate {

  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 2, 3, 4, 5 };
    int[] arr2 = { 2, 4, 6, 8 };
    int[] mergedArray = mergeAndDeduplicate(arr1, arr2);

    System.out.print("Merged Array (Duplicates Removed): ");
    for (int num : mergedArray) {
      System.out.print(num + " ");
    }
  }

  public static int[] mergeAndDeduplicate(int[] arr1, int[] arr2) {
    int totalLength = arr1.length + arr2.length;
    int[] mergedArray = new int[totalLength]; // Allocate maximum possible size
    int mergedIndex = 0;
    int i = 0;
    int j = 0;
    int prevElem = Integer.MIN_VALUE; // Use min value to track previous element

    while (i < arr1.length && j < arr2.length) {
      if (arr1[i] == arr2[j]) {
        if (arr1[i] != prevElem) { // Add only the first occurrence
          mergedArray[mergedIndex++] = arr1[i];
        }
        prevElem = arr1[i];
        i++;
        j++;
      } else if (arr1[i] < arr2[j]) {
        mergedArray[mergedIndex++] = arr1[i];
        prevElem = arr1[i];
        i++;
      } else {
        mergedArray[mergedIndex++] = arr2[j];
        prevElem = arr2[j];
        j++;
      }
    }

    // Add remaining elements from either array
    while (i < arr1.length) {
      if (arr1[i] != prevElem) {
        mergedArray[mergedIndex++] = arr1[i];
      }
      prevElem = arr1[i];
      i++;
    }
    while (j < arr2.length) {
      if (arr2[j] != prevElem) {
        mergedArray[mergedIndex++] = arr2[j];
      }
      prevElem = arr2[j];
      j++;
    }

    // Resize mergedArray to actual used size (optional)
    return Arrays.copyOf(mergedArray, mergedIndex);
  }
}
