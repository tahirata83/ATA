package day20_Hashmap;

import java.util.HashMap;



import java.util.HashMap;
import java.util.Map;

    public class JavaHashMapTask15 {
        //14. print given map, as keys in one line, and values in second line

        // Apple Lemon Peach Melon Berry
        // 100 200 150 145 250
        public static void main(String[] args) {
            HashMap<String, Integer> map = new HashMap<>();
            map.put("Apple", 100);
            map.put("Lemon", 200);
            map.put("Peach", 150);
            map.put("Melon", 145);
            map.put("Berry", 250);

            // Hint: use as many loop as you like
//        for(Map.Entry<String, Integer> e : map.entrySet()){
//            System.out.print(e.getKey() + " ");
//        }

            for (Map.Entry<String, Integer>entry : map.entrySet()) {
                String keys = entry.getKey();

                int values = entry.getValue();

                System.out.println(keys + " " + values);
            }





            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry);
            }
            System.out.println();
        }
    }



