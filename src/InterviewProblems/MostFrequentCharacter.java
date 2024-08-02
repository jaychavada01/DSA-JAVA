package InterviewProblems;

import java.util.*;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        String str = "Great power comes with great responsibility";
        char charArray[] = str.toCharArray();

        Map<Character, Integer> map = new LinkedHashMap<>();

        // adding characters to the map
        for (char c : charArray) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        /*
         * // Print the LinkedHashMap
         * for (Map.Entry<Character, Integer> entry : map.entrySet()) {
         * System.out.println("Character: " + entry.getKey() + ", Frequency: " +
         * entry.getValue());
         * }
         */

        // for maximum occurrence
        Set<Map.Entry<Character, Integer>> linkmap = map.entrySet();
        char maxKey = ' ';
        int maxvalue = 0;

        for (Map.Entry<Character, Integer> data : linkmap) {
            if (data.getValue() > maxvalue) {
                maxvalue = data.getValue();
                maxKey = data.getKey();
            }
        }
        System.out.println("Frequent character is " + maxKey);
        System.out.println("Frequency is " + maxvalue);
    }
}
