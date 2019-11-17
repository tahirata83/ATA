package day12;

import java.util.Scanner;

public class DoWhileTask1 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int pin = 0;
        do {
        System.out.println("please write your PIN: ");
        pin = scan.nextInt();
        if( (pin<999) ||(pin>10000)){
            System.out.println("incorrect pin");

        }

    } while (pin != 9999);
        System.out.println("Take you card");
}
}




