package day8;

import java.util.Scanner;

public class javaSwitchInt2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("provide a number:");
            int dayOfWeek = scanner.nextInt();
            // 0 1 2 3 4 5 6 7 8 9 10
            switch (dayOfWeek) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("WEdnesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;

                default:
                    System.out.println("invalid grade");
                    break;


            }

        }















    }
