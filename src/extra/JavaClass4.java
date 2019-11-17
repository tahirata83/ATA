package extra;

public class JavaClass4 {


    public static void main(String[] args) {
     // string lenght

        String s1 = "ABCDE";

        System.out.println(s1.length());

        int length = s1.length();
        System.out.println(length);

        String username = "techno.study";
        if(username.length() < 10) {
            System.out.println("you can login");

            if(username.length() >= 10) {
                System.out.println("you cannot login");

        }
    }

        //Task 1: Write a program that sums two strings length
        //ex: "ABC", "Z" => 3+1 =>
        //output: "Length is 4"


        String s3 = "ABC";
        String s4 = "Z";
         int s5 = s3.length() + s4.length() ;
        System.out.println("Length is" +s5);

// 1. way
        //   System.out.println("Length is " + (a1+a2).length());
        // 2. way
        //   System.out.println("Length is " + (a1.length()+a2.length()));
        // 3. way
        // int lengthA1 = a1.length();
        // int lengthA2 = a2.length();
        //  int sum = lengthA1 + lengthA2;
        //    System.out.println("Length is " + sum);


        //Task 2: Write a program that check if
        // the subtraction of s1's and s2's length()
        // is less than 0,
        // if it is less print "can not proceed",
        // else "we can do it"

        // ex1: s1="LongStringHere", s2="ShortOne"
        //       =>  "we can do it"
        // ex2: s1="short", s2="loooooooong"
        //       =>  "can not proceed"



        String s6 = "ABCE";
        String s7 = "ZVOKLJ";


        {
            if ((s6.length() - s7.length())< 0)

            System.out.println("can not proceed");

         else
            System.out.println("we can do it");
        }

        System.out.println("--------------------- " );

        String s8 = "TAHIR";
        String s9 = "ATA";
        int subtraction  = s8.length() - s9.length();
        System.out.println("Length of subtraction is " +subtraction);

        {
            if (subtraction  < 0)

                System.out.println("You can not proceed");

            else
                System.out.println("we can do it");
        }












    }




    }
