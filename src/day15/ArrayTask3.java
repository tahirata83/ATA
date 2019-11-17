package day15;
import java.util.Random;
public class ArrayTask3 {
    //TODO Task
    // part1. fill array with random values using Random/Math.random,
    // part2. print it in reverse order




        //TODO Task
        // part1. fill array with random values using Random/Math.random,
        //        10 < array.length < 100
        // part2. find average of array;
        //  ex: [1, 5, 6, 8] => 20/4 => 5
        public static void main(String[] args){
            Random rand = new Random();
            int[] a = new int[5];
            for (int i = 0; i < a.length; i++) {
                a[i] = (int) (Math.random() * 5);
                System.out.println(i);
            }


                for (int i = a.length - 1; i >= 0; i--){
                    a[i] = (int)(Math.random()*5);
                    System.out.println(i);






            }












}}