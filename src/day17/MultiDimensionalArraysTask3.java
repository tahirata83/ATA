package day17;
public class MultiDimensionalArraysTask3 {
    public static void main(String[] args) {
            //part1. print
            // apple lemon peach
            // red green blue
        String[][] array = {
                    {"apple", "lemon", "peach"},
                    {"red", "green", "blue"}
            };
        System.out.print(array[0][0] + " ");
        System.out.print(array[0][1] + " ");
        System.out.print(array[0][2] + " ");
        System.out.println();
        System.out.print(array[1][0] + " ");
        System.out.print(array[1][1] + " ");
        System.out.print(array[1][2] + " ");
        System.out.println();

        System.out.println("======================================================================");



                for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j]+" "); }
                System.out.println(); }
            System.out.println("======================================================================================");
        System.out.println( array[1][0] + " " + array[1][1] + " " + array[1][2]);
        System.out.println(array[0][0] + " " + array[0][1] + " " + array[0][2]);
        System.out.println("======================================================================================");
            for (int i = array.length-1; i >=0 ; i--) {
                    for (int j = 0; j < array[i].length; j++) {
                        System.out.print(array[i][j] + " ");
                    }
                    System.out.println();
        }
        System.out.println("======================================================================================");
        //part3, you have to USE 2 LOOP and print
        // red apple
        // green lemon
        // blue peach
        System.out.print(array[1][0] + " ");
        System.out.print(array[0][0] + " ");
        System.out.println();
        System.out.print(array[1][1] + " ");
        System.out.print(array[0][1] + " ");
        System.out.println();
        System.out.print(array[1][2] + " ");
        System.out.print(array[0][2] + " ");
        System.out.println();
        System.out.println("======================================================================================");





        }}