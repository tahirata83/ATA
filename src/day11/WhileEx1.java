package day11;

import java.util.Scanner;

public class WhileEx1 {





        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Write a string");
            String s = scan.nextLine();

            while (!s.equals("o")) { //s != "exit"
                System.out.println("Write a string");
                s = scan.nextLine();
            }

            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

            System.out.println("Write a string");
            String s1 = scan.nextLine();

            while (!s1.equals("quit")) { //s != "exit"
                System.out.println("Write a string");
                s1 = scan.nextLine();
            }

            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

            System.out.println("Write a string");
            String s2 = scan.nextLine();

            while (!s2.equals("quit")) { //s != "exit"
                if(s2.length() >= 10 ){
                System.out.println("string is too large");
                s1 = scan.nextLine();
            }





        }
    }}




