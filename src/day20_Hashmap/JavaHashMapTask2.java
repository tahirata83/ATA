package day20_Hashmap;

import java.util.HashMap;
import java.util.Map;

public class JavaHashMapTask2 {
    //2. Write a Java program to count the number
    //  of key-value (size) mappings in a map.


    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(4, "White");
        map.put(5, "Blue");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String point = entry.getValue();
            System.out.println(key + " " + point);
        }


    }

}