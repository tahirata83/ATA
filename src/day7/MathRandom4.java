package day7;

public class MathRandom4 {
    public static void main(String[] args) {

    int n1 = 10;
    int n2 = 20;
    int range1 = n2 - n1;
    int range2 = n2 - n1;


    int randomInRange1 = n1 + (int) (Math.random() * (range1 + 1));
    int randomInRange2 = n1 + (int) (Math.random() * (range2 + 1));
        System.out.println(randomInRange1 + randomInRange2);
}}
