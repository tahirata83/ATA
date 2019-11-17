package day22_Practice;

import java.util.Arrays;

public class Task1 {
    //Write a Java program to sort a numeric array and a string array.
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 10, 2, 0};
        String[] names = {"Zeynep", "Serkan", "Bayram"};

        System.out.println("First Numeric array : "+Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Sorted Numeric array : "+Arrays.toString(numbers));


        System.out.println("First String array : "+Arrays.toString(names));
        Arrays.sort(names);
        System.out.println("Sorted String array : "+ Arrays.toString(names));
        System.out.println("===================================================================");



        String [] s1= {"day","number","name"};
        int [] num= {5,90,6,8,23,55};

        Arrays.sort(s1);
        for(String s:s1) {
            System.out.println(s);
        }
        Arrays.sort(num);
        for(int a:num) {

            System.out.println(a);
            int num1[] = {1, 4, 3, 8, 5, };
            int sum = 0;

            for (int number : num) {
                sum += number;


            }
            System.out.println("The sum is " + sum);




        }

    }
}