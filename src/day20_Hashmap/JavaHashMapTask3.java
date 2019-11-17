package day20_Hashmap;

import java.util.HashMap;
import java.util.Map;

public class JavaHashMapTask3 {
    //3. Write a Java program to copy all of the
    //   mappings from the specified map to another map.

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(4, "White");
        map.put(5, "Blue");

        HashMap<Integer, String> map2 = new HashMap<>();
        map2= new HashMap<>(map);
        for (Map.Entry<Integer, String> entry : map2.entrySet()) {
            Integer key = entry.getKey();
            String point = entry.getValue();
            System.out.println(key + " " + point);
        }

    }
}