package day20_Hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class JavaHashMapTask1 {
    public static void main(String[] args) {
        // Sinan 95
        // Max 54

//        ArrayList<String> names = new ArrayList<>();
//        names.add("Sinan");
//        names.add("Max");
//
//        ArrayList<Integer> points = new ArrayList<>();
//        points.add(95);
//        points.add(54);
//
//        int size = names.size();
//        for (int i = 0; i < size; i++) {
//            String name = names.get(i);
//            Integer point = points.get(i);
//
//            System.out.println(name + " " + point);
//        }

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Score 1", 95);
        map.put("Score 2", 54);
        map.put("Score 3", 67);
        map.put("Score 4", 89);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String name = entry.getKey();
            Integer point = entry.getValue();
            System.out.println(name + " " + point);
        }
//        System.out.println(map);
//
    }
}
