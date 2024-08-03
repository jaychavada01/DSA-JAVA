package InterviewProblems.Stacks;

/*
 * Algorithm:
 * Step 1: Traverse a string.
 * Step 2: Opening breacket then push it onto the stack
 * Step 3: Closing breacket then check is there any opening bracket at the top of stack then pop it
 */

import java.util.*;

public class BracketValidation {
    public static void main(String[] args) {
        String str = "{((}))[]";
        isValid(str);
    }

    public static void isValid(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(') {
                stack.push(str.charAt(i)); // opening bracket then push
            } else if (!stack.empty() && ((str.charAt(i) == ']' && stack.peek() == '[') ||
                    (str.charAt(i) == '}' && stack.peek() == '{') ||
                    (str.charAt(i) == ')' && stack.peek() == '('))) {
                stack.pop(); // closing bracket then pop
            } else {
                stack.push(str.charAt(i));
            }
        }

        if (stack.empty()) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not-Balanced");
        }
    }
}
