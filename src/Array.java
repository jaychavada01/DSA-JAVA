import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[][] array = new int[3][3];
        System.out.println("Array Length: " + array.length); // no of rows

        // input
        for (int row = 0; row < array.length; row++) {
            // for each col in every row
            for (int col = 0; col < array[row].length; col++) {
                System.out.print("Enter Array Data: ");
                array[row][col] = in.nextInt();
            }
        }
        // output
        // for (int row = 0; row < array.length; row++) {
        //     // for each col in every row
        //     for (int col = 0; col < array[row].length; col++) {
        //         System.out.print(array[row][col] + " ");
        //     }
        //     System.out.println();
        // }

        // inhanced way to output 2D array 
        for(int row = 0; row < array.length; row++) {
            System.out.println(Arrays.toString(array[row]));
        }
        in.close();
    }
}
