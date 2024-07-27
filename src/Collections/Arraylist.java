package Collections;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(20);
        list.add(21);
        list.add(22);

        list.add(2, 23);

        System.out.println(list);
    }
}
