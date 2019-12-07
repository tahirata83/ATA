package day43.task;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

//create class Multiplier
//create method which multiply 2 integers
//create method which multiply 3 integers
//create method which multiply a list of integers
//create method which multiply 2 double
//and test them using junit
public class Multiplier {

    int multiply(short a, short b) {
        System.out.println("multiply(short a, short b)");
        return a * b;
    }

    int multiply(int a, int b) {
        System.out.println("multiply(int a, int b)");
        return a * b;
    }

    int multiply(long a, long b) {
        System.out.println("multiply(long a, long b)");
        return (int) (a * b);
    }














    int multiply(int a, int b, int c) {
        System.out.println("multiply(int a, int b, int c)");
        return a * b * c;
    }

    int multiply(List<Integer> list) {
        int result = 1;
        for (Integer num : list) {
            result *= num;
        }

        return result;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    @Test
    public void multiplyTwoIntegers() {
        int actual = multiply(2L, 2L);
        int expected = 4;

        Assert.assertEquals(expected, actual);
    }


















    @Test
    public void multiplyThreeIntegers() {
        int actual = multiply(2, 2, 2);
        int expected = 8;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void multiplyListIntegers() {
        int actual = multiply(Arrays.asList(1, 2, 3));
        int expected = 6;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void multiplyTwoDoubles() {
        double actual = multiply(2.0, 2.0);
        double expected = 4.0;

        Assert.assertEquals(expected, actual, 1);
    }

}