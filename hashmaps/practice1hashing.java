package hashmaps;

import java.util.HashMap;

public class practice1hashing {
    //hash maps contain a key and a value

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(500084895, "Heraj");
        map.put(500087945, "kalyan");

        System.out.println(map);

        if(map.containsKey(500084895)) {
            System.out.print("The student is present in the list of students: "+map.get(500084895));
        }
    }
}
