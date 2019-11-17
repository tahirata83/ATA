package day14;

import javax.swing.*;

public class FindMinimumInArray {
    private static Object min;

    //the task is to find and print out the minimum element

    public static <min> void main(String[] args) {
        int[] myArray = {2, 11, 45, 9, 56};
        // 0   1   2   3  4
            int min = myArray[0];
        for (int i = 0; i < myArray.length; i++) {

            if (myArray[i] < min) {
                min = myArray[i];
            }

        }System.out.println(min);
    }}

