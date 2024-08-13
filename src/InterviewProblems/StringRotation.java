package InterviewProblems;

public class StringRotation {
    public static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        String temp = s1 + s1;
        char[] c1 = temp.toCharArray();
        char[] c2 = s2.toCharArray();

        int j = 0;
        for (int i = 0; i < temp.length(); i++) {
            if (c1[i] == c2[j]) {
                if (s2.length() - 1 == j) {
                    return true;
                }
                j++;
            } else {
                if (s2.length() - 1 == j) {
                    return true;
                }
                j = 0;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isRotation("abcde", "cdeab"));
    }
}
