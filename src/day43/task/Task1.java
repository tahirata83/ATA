package day43.task;

import java.util.List;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class Task1 {
    //create class Multiplier
    //create method which multiply 2 integers
    //create method which multiply 3 integers
    //create method which multiply a list of integers
    //create method which multiply 2 double
    //and test them using junit








    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    static int add(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }}