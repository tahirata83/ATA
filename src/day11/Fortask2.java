package day11;

import java.util.Scanner;

public class Fortask2 {
    public static void main(String[] args) {


        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0)

                System.out.println(i);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide first number:");
       int a;
        int num = scanner.nextInt();

        for (a = 0; a <= num; a++) {
            if (a % 2 == 0)

                System.out.println(a);

        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++" );
        System.out.println("Provide first number:");
        int b;
        int num2 = scanner.nextInt();

        for (b = 50; b <= 100; b++) {
            if (b % 2 == 0)

                System.out.println(b);


    }
}}
