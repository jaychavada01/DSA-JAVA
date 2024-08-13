package InterviewProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");

        String str = sc.nextLine();
        countCharOccurrences(str);
        countCharHashmap(str);
        sc.close();
    }

    public static void countCharOccurrences(String str) {
        int[] charCounts = new int[256]; // Assuming ASCII characters

        for (char c : str.toCharArray()) {
            charCounts[c]++;
        }

        System.out.println("Character Counts with array mathod:");
        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] > 0) {
                System.out.println((char) i + ": " + charCounts[i]);
            }
        }
    }

    public static void countCharHashmap(String str) {
        Map<Character, Integer> charCountsMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            charCountsMap.put(c, charCountsMap.getOrDefault(c, 0) + 1);
        }

        System.out.println("Character Counts using Hashmap:");
        for (Map.Entry<Character, Integer> entry : charCountsMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
