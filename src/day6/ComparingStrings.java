package day6;

public class ComparingStrings {

    public static void main(String[] args) {
        String s1 = "YES";
        String s2 = "YES";

        if(s1 == s2){
            System.out.println("its equal");
        }

        String s3 = new String("YES");
        String s4 = new String("YES");

        if(s3.equals(s4)){
            System.out.println("its equal again");
        }

        String name = "Ali";
        if(name.equals("Max")){
            System.out.println("Hello");
        }

        String nameOfCourse = "TS";
        if(nameOfCourse.equals("TS")){
            System.out.println("You gonna be Tester after 6 months");
        }

        // Task 1:
        //  check if string is equals to your name, print your surname
        //  ex: Michale => Jackson

        String name1 = "TAHIR";
        String name2 = "TAHIR";

        if(name1.equals("TAHIR")) {
            System.out.println("ATA");

        }

        String NAME3 = "TAHIR";
        String SURNAME3 = "ATA";

        if(SURNAME3.equals("TAHIR")) {
            System.out.println("ATA");
        }

        int number = 10;
        if(number==10){
            System.out.println("its ten");
        }







    }}


