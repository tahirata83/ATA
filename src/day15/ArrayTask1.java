package day15;


import java.util.Random;
public class ArrayTask1 {
    //TODO Task
    // part1. fill array with random values using Random/Math.random,
    //        10 < array.length < 100
    // part2. find average of array;
    //  ex: [1, 5, 6, 8] => 20/4 => 5
    public static void main(String[] args){
        Random rand = new Random();
        int[] myArray = new int[50];
        for (int num = 10;num < myArray.length;num++){
            myArray[num] = (int)(Math.random()*100);
            System.out.println(myArray[num]);
        }
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        System.out.println("Sum is: " +sum);

        double average = (double) sum / myArray.length;
        System.out.println("Average:  " + average);










    }}