package day20_Hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class JavaHashMapTask17 {
    //17. Given map, update the values
    // Apple 333
    // Lemon 444
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 100);
        map.put("Lemon", 200);
        System.out.println(map);
        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("Apple", 333);
        map2.put("Lemon", 444);
        System.out.println(map2);

        if (map.containsKey("Apple")){
            map.put("Apple", 500);
        }
        System.out.println("There is " + map);
    }


    }