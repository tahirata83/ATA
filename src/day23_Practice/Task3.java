package day23_Practice;

import java.util.Arrays;

public class Task3 {
    //    Write a Java program to find the largest element in an array.
// {1,34,66,1000,23,4,7,9} => 1000



    public static void main(String args[]) {
        int a[] = {1,34,66,1000,23,4,7,9};
        Arrays.sort(a);


        int max= a[a.length-1];
        System.out.println(max);

// 2.way
        int [] arr = {12,45,29,58,99,104,36};
        int maximum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
        }
        System.out.println(maximum);




    }
}
