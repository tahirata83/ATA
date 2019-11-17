package day20_Hashmap;

import java.util.HashMap;
import java.util.Map;

public class JavaHashMapTask10 {
    //8. Write a Java program to test if a
    //   map contains a mapping for the specified value.
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(4, "White");
        map.put(5, "Blue");
        int key = 5;
        if (map.containsKey(key)) {
            System.out.println("Value is " + map.get(key));
        } else {
            System.out.println("No we don't have");
    }}}