package InterviewProblems;
public class StringReverse {
    public static void main(String[] args) {
        String str = "jaychavada";
        String reversedStr = reverseStringrec(str);
        System.out.println("Reversed string with recursion: " + reversedStr);
        
        
        // non-recursive method
        String str1 = "jaychavada";
        String rev = "";
        char ch; 

        for (int i = 0; i < str1.length(); i++) {
            ch = str1.charAt(i);
            rev = ch + rev;
        }
        
        System.out.println("Reversed string without recursion: " + rev);
    }

    // recursively
    public static String reverseStringrec(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseStringrec(str.substring(1)) + str.charAt(0);
    }
}
