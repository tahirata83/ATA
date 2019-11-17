package day8;

import java.util.Scanner;

public class IfElse4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide a temperature:");
        //write a program that print temperature in human readable words
        //ex: 70 => hot
        int temperature = scan.nextInt();
        if(temperature >= 70){
            System.out.println("Hot");
        }else if(temperature < 70 && temperature >= 50) {
            System.out.println("Warm");
        }else if(temperature < 50 && temperature >= 20){
                System.out.println("Cold");
        }
        else{
            System.out.println("Freezing"); }
        // cold
        // freezing

    }
}