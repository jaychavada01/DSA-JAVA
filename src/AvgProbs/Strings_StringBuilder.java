package AvgProbs;
import java.util.Arrays;

public class Strings_StringBuilder {
    public static void main(String[] args) {
        String name = "Jay Chavada";
        System.out.println(name);

        String a = "jay";
        String b = "jay";

        // comparison through string pool
        System.out.println(a == b);

        // comparison outside of string pool
        String name1 = new String("Jay");
        String name2 = new String("Jay");

        System.out.println(name1 == name2);
        // only checking the values of variables
        System.out.println(name1.equals(name2));

        // pretty printing
        float num = 4563.59892f;
        System.out.printf("Formatted number is %.2f", num);

        System.out.println();
        // System.out.println("Printing strings with placeholders....%s, %f and many");

        System.out.printf("Pie is %.3f", Math.PI);

        System.out.println();
        System.out.printf("Hello my name is %s and i am %s", "JayChavada", "Web Developer \n");

        System.out.println("Stings operation with operator:");

        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + 3);
        System.out.println((char) ('a' + 3));
        System.out.println("a" + 1);

        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            // System.out.println(ch);
            series = series + ch;
        }
        System.out.println(series);

        System.out.println("StringBuilder");

        // stringbuilder is mutable
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch);
        }
        builder.deleteCharAt(0);
        builder.insert(0, "Jay", 0, 3);
        builder.reverse();
        System.out.println(builder);

        // methods
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toUpperCase());
        System.out.println("        Jay     ".strip());
    }
}