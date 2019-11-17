package day7;
import java.util.Scanner;
public class UserInput {


             public static void main(String[] args) {
                 Scanner scan = new Scanner(System.in);
                 System.out.println("Enter your name: ");
                 String name = scan.nextLine(); // name = "Max"
                 System.out.println("Welcome " + name + "!!!");

                 System.out.println("-----------------------");
                 String s1 = scan.nextLine();
                 System.out.println("Your text is: " + s1);

                 System.out.println("-----------------------");



                 Scanner sc = new Scanner(System.in);
                 String s = sc.nextLine();
                 System.out.println("Text is: " + s1);

                 int i1 = sc.nextInt();
                 System.out.println("Number is: " + i1);
                 System.out.println("=================================================" );

                 Scanner sc2 = new Scanner(System.in);
                 String s2 = sc.nextLine();
                 System.out.println("provide a number: " + s2);
                 int i2 = sc2.nextInt();
                 System.out.println("Your Number is: " + i2);





}}

