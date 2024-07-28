package Collections;

/*
 * Set takes unique values.
 * Set inserts value in random order.
 * LinkedHashSet prints value in order of insertion.
 * TreeSet is sorted set, and store unique values not duplicated.
 */

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        set.add(10);
        set.add(52);
        set.add(5);
        set.add(6);
        set.add(30);
        set.add(3);

        System.out.println("Set: "+set);

        // linkedHashSet
        LinkedHashSet<Integer> lset = new LinkedHashSet<Integer>();

        lset.add(10);
        lset.add(52);
        lset.add(5);
        lset.add(45);
        lset.add(78);

        System.out.println("LinkedHashSet: " +lset);
        System.out.println(lset.contains(52));

        TreeSet<Integer> tset = new TreeSet<Integer>();
        tset.add(20);
        tset.add(2);
        tset.add(5);
        tset.add(9);
        tset.add(80);

        System.out.println("TreeSet: " +tset);
    }
}
