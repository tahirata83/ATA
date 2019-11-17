package day12;

public class LoopBreakTask1 {

    public static void main(String[] args) {
        int number = 1;
        for (int i = 1; i <= 1000000000; i++) {

            if (i == 232558) {
                number = i;
                break;
            }
        }
        System.out.println("Your number is " + number);


    }{
        int number1 = 0;
        double random=Math.random();
        for (int i = 1; i <= 1_000_000_000; i++) {
            System.out.println(i);
            if (i == random) {
                number1 = i;
                break;

            }
            }

        System.out.println("Your number is " + number1);


















    }
}