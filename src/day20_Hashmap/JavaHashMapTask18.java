package day20_Hashmap;

import java.util.HashMap;
import java.util.HashSet;

public class JavaHashMapTask18 {
    //17. Count characters in string
    //   "BECOME A SOFTWARE TEST ENGINEER IN 6 MONTHS!"
    // for ex:
    // A: 2
    // B: 1
    // ...
    //part 1
    // print every character in separate line

    //part2
    // put every character in to one HashSet

    //part3
    // put every character in HashMap<Character, Integer>, use value 0

    //part4
    // when you are putting character, check if you have that character already,
    // if you have, increment value, if you dont have just add character to map

    //part5
    //print HashMap


    public static void main(String[] args) {
        //   "BECOME A SOFTWARE TEST ENGINEER IN 6 MONTHS!"
        //part 1
        // print every character in separate line
        String sentence = "BECOME A SOFTWARE TESTER IN 6 MONTHS";
//        System.out.println("1. way");
//        for (int i = 0; i < sentence.length(); i++) {
//            System.out.println(sentence.charAt(i));
//        }
//        char[] charArray = sentence.toCharArray();
//        System.out.println("2. way");
//        for (int i = 0; i < charArray.length; i++) {
//            System.out.println(charArray[i]);
//        }
//        System.out.println("3. way");
//        for (char c : charArray) {
//            System.out.println(c);
//        }

        //part2
        // put every character in to one HashSet
//        HashSet<Character> mySet = new HashSet<>();
//        for (int i = 0; i < sentence.length(); i++) {
//            char aChar = sentence.charAt(i);
//            mySet.add(aChar);
//        }
//        System.out.println(mySet);
        //part3
        // put every character in HashMap<Character, Integer>, use value 0
        HashMap<Character, Integer> myMap = new HashMap<>();
        for (int i = 0; i < sentence.length(); i++) {
            char aChar = sentence.charAt(i);
            myMap.put(aChar,0);
        }
        System.out.println(myMap);
    }
}