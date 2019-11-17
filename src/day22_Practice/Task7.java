package day22_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task7 {
    // Write a Java program to convert an array to ArrayList
    public static void main(String[] args) {
        String[] names = {"yasin", "kemal", "suna", "nalan"};

        //1.way
//        List<String> nameList = Arrays.asList(names);
//        System.out.println(nameList);
//        nameList.remove("yasin");
//        System.out.println(nameList);

        //2.way
        ArrayList<String> nameList = new ArrayList<>();
        System.out.println(nameList);
        for(String s : names){
            nameList.add(s);
        }
        System.out.println(nameList);
    }
}