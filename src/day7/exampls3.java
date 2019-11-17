package day7;
import java.util.Scanner;
public class exampls3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("provide a first number: ");

        int i = sc.nextInt();

        if(i %2 == 0){
            System.out.println("even");
        }

        else  {
            System.out.println("odd");
        }




    }}