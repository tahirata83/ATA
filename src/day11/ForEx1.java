package day11;

import java.util.Scanner;

public class ForEx1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Provide a:");
        int a = scan.nextInt();
        System.out.println("Provide b:");
        int b = scan.nextInt();

        for(int i = 1; i <= a; i++){
            System.out.println(i * b);
        }
    }}
