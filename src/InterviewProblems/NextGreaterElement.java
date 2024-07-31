package InterviewProblems;

// Problem: Given a input array, print the next greater element for every element in the array

public class NextGreaterElement {

    public static void printNextGreaterElements(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        int next;
        for (int i = 0; i < arr.length; i++) {
            next = -1;

            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] < arr[j]){
                    next = arr[j];
                    break;
                }
            }
            System.out.println("Next Greater Element of " + arr[i] + " is " + next);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 2, 25, 7, 8 };
        printNextGreaterElements(arr);
    }
}
