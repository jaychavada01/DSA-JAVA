package Collections;
/*
 * HashMaps are unordered map
 * HashSet insert elements in unordered set, when counting size of the sets it will consider duplicates only once.
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Hashing {
    public static void main(String[] args) {

        System.out.println("***************** HASHSET ****************");
        
        HashSet<Integer> set = new HashSet<Integer>();
        
        set.add(12);
        set.add(13);
        set.add(14);
        set.add(15);
        set.add(16);
        
        System.out.println(set);

        // search
        if(set.contains(12)){
            System.out.println("Set contains 12");
        }else{
            System.out.println("Set does not contains 12");
        }

        // delete
        set.remove(12);
        if (set.contains(12)) {
            System.out.println("Set contains 12");
        } else {
            System.out.println("Set does not contains 12");
        }
        
        // size printing
        System.out.println("Size of set: " + set.size());
        
        // iteration
        System.out.println("Iteration: ");
        for (Integer integer : set) {
            System.out.println(integer);
        }        

        System.out.println("***************** HASHMAP ****************");
        
        HashMap<String, Integer> map = new HashMap<>();
        
        // Insertion for new pair insertions
        map.put("India", 120);
        map.put("US", 30);
        map.put("UK", 35);

        System.out.println("Map: " + map);

        // updation of old pair
        map.put("US", 33);
        System.out.println("Map: " + map);

        // search
        if (map.containsKey("UK")) {
            System.out.println("Key is present in the map");
        } else {
            System.out.println("Key is not present in the map");
        }

        // find key with value
        System.out.println(map.get("UK")); // key exists
        System.out.println(map.get("China")); // key does not exist


        // Iteration
        int[] arr = {12,15,16,17,20,36};

        System.out.print("Iteration with for loop: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        System.out.print("Iteration with for each loop: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
        
        // iteration on collections with entryset
        System.out.println("Iteration with entryset: ");
        for(Map.Entry<String, Integer> e:map.entrySet()){
            System.out.print(e.getKey()+" => ");
            System.out.println(e.getValue());
        }

        // removing pair
        map.remove("UK");
        System.out.println("Collection after removing pair: "+ map);
    }
}