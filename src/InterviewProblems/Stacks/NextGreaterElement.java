package InterviewProblems.Stacks;

import java.util.*;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = { 5, 7, 1, 2, 6, 0};

        int result[] = nextGreater(arr);
        System.out.println("The next greater elements are ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] nextGreater(int[] arr) {
        int n = arr.length;
        int result[] = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 2 * n - 1; i >= 0; i--) {
            while (stack.isEmpty() == false && stack.peek() <= arr[i % n]) {
                stack.pop();
            }

            if (i < n) {
                if (stack.isEmpty() == false)
                    result[i] = stack.peek();
                else
                    result[i] = -1;
            }
            stack.push(arr[i % n]);
        }
        return result;
    }
}
