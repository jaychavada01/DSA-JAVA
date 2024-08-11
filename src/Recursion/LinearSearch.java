package Recursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,3,1,4,4,6};

        System.out.println("Element is exist or not? "+isExist(arr, 4, 0));

        System.out.println("Index of element: "+findIndex(arr, 4, 0));

        System.out.println("Last-Index of element: "+findIndexLast(arr, 4, arr.length-1));

        findAllIndex(arr, 4, 0);
        System.out.println(list);
    }

    static boolean isExist(int[] array, int target, int index) {
        if (index == array.length) {
            return false;
        }
        return array[index] == target || isExist(array, target, index+1);
    }

    static int findIndex(int[] array, int target, int index) {
        if(index == array.length) {
            return -1;
        }
        if(array[index] == target){
            return index;
        }else{
            return findIndex(array, target, index+1);
        }
    }

    static int findIndexLast(int[] array, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (array[index] == target) {
            return index;
        } else {
            return findIndexLast(array, target, index - 1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] array, int target, int index){
        if(index == array.length){
            return;
        }
        if(array[index] == target){
            list.add(index);
        }
        findAllIndex(array, target, index+1);
    }
}
