package day20_1_Practice;

import java.util.HashMap;

public class PutValue4 {
    // put letters as keys into your HashMap,
    // put value = 0
    public static void main(String[] args) {

        //{h=0,e=0,l=0,o=0}
        String sentence = "hello";
        HashMap<Character, Integer> myMap3 = new HashMap<>();
        char [] a1 = sentence.toCharArray();
        for (int i = 0; i < sentence.length(); i++) {
            myMap3.put(a1[i], 0);
        }
        System.out.println(myMap3);
        System.out.println("===============================================================");
        HashMap<Character, Integer> letterMap = new HashMap<>();
        char [] sentenceArray = sentence.toCharArray();
        for (char letter : sentenceArray) {
           letterMap.put(letter,0);
        }
        System.out.println(letterMap);









    }
}