package InterviewProblems.Stacks;

import java.util.*;

public class RemoveConsecutiveSubsequences {
    public static int[] remove(int[] arr) {
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            if (stack.size() == 0 || stack.peek() != arr[i]) {
                stack.push(arr[i]);
            }
            else if (arr[i] == stack.peek()) {
                if (i == n - 1 || arr[i] != arr[i + 1]) {
                    stack.pop();
                }
            }
        }
        int[] result = new int[stack.size()];
        int m = result.length;
        for (int i = 0; i < m; i++) {
            result[i] = stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 10, 10, 4, 4, 4, 4, 5, 5, 5, 77, 77, 20 };
        int[] result = remove(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

}
