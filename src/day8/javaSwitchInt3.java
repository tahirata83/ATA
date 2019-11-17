package day8;

import java.util.Scanner;

public class javaSwitchInt3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("write day of week:");
        String dayOfWeek = scanner.nextLine();
        // 0 1 2 3 4 5 6 7 8 9 10
        switch (dayOfWeek) {
            case "Monday":
                System.out.println("1");
                break;
            case "Tuesday":
                System.out.println("2");
                break;
            case "Wednesday":
                System.out.println("3");
                break;
            case "Thursday":
                System.out.println("4");
                break;
            case "Friday":
                System.out.println("5");
                break;
            case "Saturday":
                System.out.println("6");
                break;
            case "Sunday":
                System.out.println("7");
                break;

            default:
                System.out.println("invalid day");
                break;


        }

    }}


 class IfClass{}

