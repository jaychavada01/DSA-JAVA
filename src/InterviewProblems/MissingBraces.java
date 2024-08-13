package InterviewProblems;

public class MissingBraces {
    private static void missing(String str) {
        int i = 0, j = 0, k = 0;

        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                i++;
            } else if (ch == '{') {
                j++;
            } else if (ch == '[') {
                k++;
            }
            if (ch == ')') {
                i--;
            } else if (ch == '}') {
                j--;
            } else if (ch == ']') {
                k--;
            }
        }
        System.out.println(i + " " + j + " " + k);
        System.out.print("Missing braces is: ");
        if (i < 0 || i > 1) {
            if (i == -1) {
                System.out.print("(");
            } else if (i == 1) {
                System.out.print(")");
            }
            if (j == -1) {
                System.out.print("{");
            } else if (j == 1) {
                System.out.print("}");
            }
            if (k == -1) {
                System.out.print("[");
            } else if (k == 1) {
                System.out.print("]");
            }
        }else{
            System.out.println("None");
        }
    }

    public static void main(String[] args) {
        String str = "(({{[[]]}}))";
        missing(str);
    }
}
