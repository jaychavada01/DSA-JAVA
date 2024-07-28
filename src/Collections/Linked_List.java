package Collections;

import java.util.LinkedList;
import java.util.Vector;

public class Linked_List {
    public static void main(String[] args) {
        LinkedList<Integer> link = new LinkedList<>();

        link.add(0, 10);
        link.add(1, 15);
        link.add(20);

        link.remove(2);

        System.out.println("LinkedList is : "+link);

        // Vector
        Vector<String> v = new Vector<>();
        v.add("Jay");
        v.add("Arun");
        v.add("Dharmik");

        System.out.println("Removed "+ v.remove(1));
        v.clear();
        System.out.println("Vector is : "+v);
    }
}

/* 
 * Vector => Slow Execution, Synchronized and Thread safe
 * LinkedList/Arraylist => Fast Execution, Non-Synchronized and Not Thread safe
*/