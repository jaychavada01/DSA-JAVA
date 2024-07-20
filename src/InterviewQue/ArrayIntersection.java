public class ArrayIntersection {
  public static void main(String[] args) {
    int[] array1 = { 7, 2, 0, 4, 5 };
    int[] array2 = { 0, 5, 0, 7, 8 };

    // Find the intersection
    int[] intersection = findIntersection(array1, array2);

    // Print the intersection array
    System.out.print("Intersection: ");
    for (int i : intersection) {
      System.out.print(i + " ");
    }
  }

  public static int[] findIntersection(int[] array1, int[] array2) {
    int[] temp = new int[array1.length]; // Temporary array to store intersection
    int index = 0;

    // Loop through each element of array1
    for (int i = 0; i < array1.length; i++) {
      // Loop through each element of array2
      for (int j = 0; j < array2.length; j++) {
        // If elements match, add to temp array
        if (array1[i] == array2[j]) {
          // Check for duplicate entries in temp array
          boolean isDuplicate = false;
          for (int k = 0; k < index; k++) {
            if (temp[k] == array1[i]) {
              isDuplicate = true;
              break;
            }
          }
          // If not duplicate, add to temp array
          if (!isDuplicate) {
            temp[index++] = array1[i];
          }
        }
      }
    }

    // Create result array with the exact size of intersection elements
    int[] result = new int[index];
    for (int i = 0; i < index; i++) {
      result[i] = temp[i];
    }

    return result;
  }
}