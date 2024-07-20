import java.util.Scanner;

public class VowelsConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter string: ");

        String str = sc.nextLine();

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
        sc.close();
    }
}