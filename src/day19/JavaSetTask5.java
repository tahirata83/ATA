package day19;

import java.util.ArrayList;
import java.util.HashSet;

public class JavaSetTask5 {
    //4. Write a Java program to empty an hash set.
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(10);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        System.out.println(numbers);
        System.out.println("========================================================================");
        if (numbers.isEmpty()){
            System.out.println("It is empty");
        }else{
            System.out.println(numbers);

    }}}