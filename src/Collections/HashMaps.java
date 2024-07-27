package Collections;

/*
 * In treemap key will be sorted and in hashmap it will not. 
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Second", 30);
        map.put("First", 3);

        System.out.println("HashMap: " + map);

        TreeMap<String, Integer> tmap = new TreeMap<>();

        tmap.put("Second", 23);
        tmap.put("First", 32);

        System.out.println("TreeMap: " + tmap);
        System.out.println(tmap.get("First"));
        System.out.println(tmap.keySet());
        System.out.println(tmap.values());

        int arr[] = { 20, 35, 1, 5, 99, 78 };

        for (int e : arr) {
            System.out.print(e + " ");
            Arrays.sort(arr);
        }
        System.out.println();
        for (int e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();

        ArrayList<Integer> list = new ArrayList<>();

        list.add(20);
        list.add(21);
        list.add(22);

        list.add(2, 23);
        System.out.println(list);
        Collections.sort(list);
        System.out.println("Max " + Collections.max(list));

        Iterator i = list.iterator();
        
        while (i.hasNext()){
            System.out.println("list "+i.next());
        }
    }
}