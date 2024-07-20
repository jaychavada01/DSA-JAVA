public class CharacterCount {
    public static void main(String[] args) {
        String str = "eSparkBiz";
        countCharOccurrences(str);
    }

    public static void countCharOccurrences(String str) {
        int[] charCounts = new int[256]; // Assuming ASCII characters

        for (char c : str.toCharArray()) {
            charCounts[c]++;
        }

        System.out.println("Character Counts:");
        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] > 0) {
                System.out.println((char) i + ": " + charCounts[i]);
            }
        }
    }
}
