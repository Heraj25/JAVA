package hashmaps;

import java.util.*;

public class hashing {
    
    public static void main(String[] args) {
        //country(key) population(value)
        HashMap<String, Integer> map = new HashMap<>();

        //Insertion
        map.put("India", 120);
        map.put("China", 150);
        map.put("US", 30);

        System.out.println(map);

        map.put("China", 180);
        System.out.println(map);

        //Search Operation
        if(map.containsKey("China"))
            System.out.println("Key is present in the map.");
        else    
            System.out.println("Key is not present in the map.");

        System.out.println(map.get("China")); // key exists
        System.out.println(map.get("india")); // key doesnt exist


        //example of iteration through an array using collecctions
        // int[] arr = {1,2,3};
        // for(int val: arr)
        //     System.out.println(val);

        //Iteration in HashMap
        for(Map.Entry<String, Integer> val : map.entrySet()) {
            System.out.println(val.getKey());
            System.out.println(val.getValue());
        }
        

        Set<String> keys = map.keySet();
        for(String key: keys) {
            System.out.println(key+" "+ map.get(key));
        }


        //remove an element from the hashmap
        map.remove("China");
        System.out.println(map);
    }
}
