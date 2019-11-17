package day7;
import java.util.Scanner;
public class examples2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("provide a first number: ");

        int i = sc.nextInt();

        if(i <= 0){
            System.out.println("negative");
        }

        if(i >= 0) {
            System.out.println("pozitive");
        }




}}
