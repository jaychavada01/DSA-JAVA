package Stack;

/*
 * Algorithm:
 * Step 1: Traverse a string.
 * Step 2: If the current character is starting bracket '{','(','[' then push it into the stack.
 * Step 3: If the current character is closing bracket '}',')',']' and top of the stack is starting bracket then pop it from the stack.
 * Step 4: After the Traversal if Stack is empty then it is balanced otherwise it is not balanced.
 */

import java.util.Stack;

public class ParenthesesChecker {
    public static void main(String[] args) {
        String str = "{()}[]";

        Stack<Character> stackChar = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(') {
                // character will be push to stack
                stackChar.push(str.charAt(i));
            } else if (!stackChar.empty() && (
                (str.charAt(i) == ']' && stackChar.peek() == '[') ||
                (str.charAt(i) == '}' && stackChar.peek() == '{') ||
                (str.charAt(i) == ')' && stackChar.peek() == '(')))
            {
                stackChar.pop();
            } else {
                stackChar.push(str.charAt(i));
            }
        }

        if (stackChar.empty()) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not-Balanced");
        }
    }
}
