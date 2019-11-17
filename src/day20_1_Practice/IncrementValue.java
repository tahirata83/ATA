package day20_1_Practice;

import java.util.HashMap;

public class IncrementValue {
    // Given map, update map values each time of iteration

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 0);

        String sentence = "ABC";
        for(char c : sentence.toCharArray()){
            System.out.println(map);
            //write you code here
            Integer value = map.get("A");

            map.put("A", value + 1 );
        }
        //output:
        // {"A"=0}
        // {"A"=1}
        // {"A"=2}
    }}