package day20_1_Practice;

import java.util.HashMap;

public class PutValue3 {
    // Put first names and last names into your map, and print
    public static void main(String[] args) {
        String[] firstNames = {"Max", "Drake", "Susan"};
        String[] lastNames = {"Smith", "Jones", "Miller"};
        //write you code here
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < 3; i++) {

            map.put(firstNames[i], lastNames[i]);
        }
        System.out.println(map);
        System.out.println("==========================================================");
        HashMap<String, String> people = new HashMap<>();
        for (int i = 0; i < 3; i++) {

            String key = firstNames[i];
            String key1 = lastNames[i];
            people.put(key,key1);

        }

        System.out.println(people);
        System.out.println("==========================================================");



            //write you code here

            //end of you code
        //end of you code
        //System.out.println(map);
        //output:
        //{"Max"="Smith","Drake"="Jones","Susan"="Miller"}
    }
}