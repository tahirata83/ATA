package day19;

import java.util.HashSet;

public class JavaSetTask1 {
    //1. Write a Java program to append the specified
    // element to the end of a hash set.
    // ex: [1, 2 , 3] you add 10 => [1, 2, 3, 10]

    //part 2. add number 5, five times
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
    }
}
