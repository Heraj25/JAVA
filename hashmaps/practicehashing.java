package hashmaps;

import java.util.HashMap;

public class practicehashing {
    public static void main(String[] args) {
        
        //hashmap always has key and a value associated with it
        HashMap<String, Integer> map = new HashMap<>();

        //Insertion
        map.put("heraj", 100);
        map.put("mani", 90);
        map.put("manoj", 180);
        map.put("abhishek", 200);

        System.out.println(map);

        if(map.containsKey("abhishek")) 
            System.out.println("The topper is present in the class list with marks : "+map.get("abhishek"));
        else
            System.out.println("Topper is not Found.");
    }

 }
