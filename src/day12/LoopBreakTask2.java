package day12;

import java.util.Random;

public class LoopBreakTask2 {



    public static void main(String[] args) {
            Random rand = new Random();
        int someRandomNumber = rand.nextInt(100000000);
        int number = 0;
        double random = Math.random();
        for (int i = 1; i <= 1_000_000_000; i++) {
            System.out.println(i);
            if (i == 22) {
                number = i;
                break;

            }
        }

        System.out.println("Your number is " + number);


    }













    }


