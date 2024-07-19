public class VowelsConstant {
    public static void main(String[] args) {
        // Input string
        String str = "Hello, World!";

        // Convert to lowercase for case-insensitive check
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if alphabet
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println(ch + " is a vowel");
                } else {
                    System.out.println(ch + " is a consonant");
                }
            }
        }
    }
}