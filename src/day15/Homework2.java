package day15;

public class Homework2 {
    // research on topics "Multi Dimensional Arrays", "Nested Loops"

        // part1. Given an array of ints, print "has 1" if there is a 1 in the array
        // part2. continue part1, print "has 2" if there is a 2 in the array
        // part3. continue part2, print "has 1 and 2" if there is a 1 in the array
        //                        with a 2 somewhere later in the array.
        // part3 ex1: int[] a= {1,7,4,5,2} => "has 1 and 2"

        // part3 ex2: {1,7,4,5} => "NOTHING HERE"
        // part3 ex3: {1, 1, 1, 7, 4, 5, 2, 2} => "has 1 and 2"

        // Hint: if you array has 1 and after that somewhere has 2, is should print "has 1 and 2"
        //

    public static void main(String[] args) {
        int[] a = {2, 4, 11, 9, 14,17};
        boolean haveFive = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 12) {
                haveFive = true;
            }
        }

        if (haveFive) {
            System.out.println("you have 11 in array");
        } else {
            System.out.println("you dont have");
        }

        System.out.println("====================================================================================");
        int[] a1 = {10, 4, 5, 2, 7,8};
        boolean haveFive1 = false;
        boolean haveFive2 = false;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] == 1) {
                haveFive1 = true;
            }
            if (a1[i] == 2) {
                haveFive2 = true;
            }
        }

        if (haveFive1) {
            System.out.println("you have 1 in array");
        }
        if (haveFive2) {
            System.out.println("you have 2 in array");
        }

        System.out.println("====================================================================================");
        int[] a2 = {1, 1, 1, 7, 4, 5, 2, 2};
        boolean has1and2 = false;

        for (int i = 0; i < a2.length; i++) {
            if (a2[i] == 1 && a2[i] == 2) {
                has1and2 = true;
            }
        }
        if (has1and2 ) {
            System.out.println("you have 1 and 2 in array");
        } else {
            System.out.println("you dont have");
        }
        System.out.println("====================================================================================");
        int[] a3 = {1, 1, 1, 7, 4, 5, 2, 2};
        boolean have1and2 = false;

        for (int i = 0; i < a2.length; i++) {
            if (a3[i] == 1 ) {
                have1and2 = true;
            }
            if (a3[i] == 2 ) {
                have1and2 = true;
            }


        }
        if (have1and2 ) {
            System.out.println("you have 1 and 2 in array");}
            if (have1and2 ) {
                System.out.println("you have 1 and 2 in array");
        }










    }}









