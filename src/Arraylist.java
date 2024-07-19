import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);

        // list.add(990);
        // list.add(99);
        // list.add(10);
        // list.add(156);
        // list.add(15695);
        // list.add(15695786);
        // list.add(786);
        // System.out.println(list);
        // System.out.println(list.contains(786));

        // // update stuff
        // list.set(0, 1200);
        // // remove
        // list.remove(2);
        // System.out.println(list);

        // input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        // output
        for (int i = 0; i < 5; i++) {
            // pass index here
            System.out.println(list.get(i)); 
        }
        in.close();
    }
}