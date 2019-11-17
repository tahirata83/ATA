package OfficeHour3;

import java.util.Random;
   import java.util.Scanner;
   public class OfficeHour3Switch {


        public static void main(String[] args) {
            System.out.println(" Type any month" );
            Scanner scan = new Scanner(System.in);
            String month = scan.nextLine();

            switch(month){
                case("January"):

                    System.out.println(month + " is the first month of the year ");
                    break;

                case("February"):

                    System.out.println(month + " is the second month of the year ");
                    break;

                case("March"):

                    System.out.println(month +" is the third month of the year");

                default:
                    System.out.println(month + " is not in my options dude ");

            }


            Random rnd3 = new Random();

            int i3 = 12;

            switch(i3){

                case(1):
                    System.out.println(i3+". month of the year is January ");
                    break;
                case(2):
                    System.out.println(i3+". month of the year is February ");
                    break;
                case(3):
                    System.out.println(i3+". month of the year is March ");
                    break;
                case(4):
                    System.out.println(i3+". month of the year is April ");
                    break;

                default:
                    System.out.println("this is out of my range but its okay !!!!!   " + i3 );

                case(5):
                    System.out.println("THis is after default");

            }


        }








                }
