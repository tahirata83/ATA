package day6;

public class StringConvertingToUppercaseAndLowercase {

    // You can convert Strings to uppercase and lowercase
    // using the methods toUpperCase() and toLowerCase()

    public static void main(String[] args) {
        String s1 = "techno study";
        //to convert to uppercase TECHNO STUDY use toUpperCase();
        System.out.println(s1.toUpperCase());

        System.out.println("-------------------------");
        String s2 = "HeLLo WoRlD";
        System.out.println(s2);
        System.out.println(s2.toUpperCase()); // to make it UPPERCASE
        System.out.println(s2.toLowerCase()); // to make it LOWERCASE


        String s3 = "TaHir";
        String s4 = "AtA";

        System.out.println(s3.toUpperCase()); // to make it UPPERCASE
        System.out.println(s4.toLowerCase()); // to make it LOWERCASE




        String s5 = "TechnoStudySCHOOL";
        System.out.println("Lowercase is here:  " + s5.toLowerCase());
        System.out.println("Uppercase is here:  " +s5.toUpperCase());


        s5.toUpperCase();
        System.out.println("trying to Uppercase is here: " + s5);

        String s6 = s5.toUpperCase();
        System.out.println("trying to Uppercase is here: " + s6);


      //  equal

        String s7 = "New Jersey";
        String s8 = "New Jersey";
        System.out.println("is s7 equals to s8: " + s7.equals(s8));
        s8 = s8.toLowerCase();
        System.out.println("is s7 equals to s8 lower case: " + s7.equals(s8));

        //equalIgnoreCase

        System.out.println("is s7 equals ignore case equal to s8 lower case: " + s7.equalsIgnoreCase(s8));

        // contains

        String s9 = "New Jersey";
        String s10 = "New ";
        System.out.println("is s9 contains s10: " + s9.contains(s10));

        // endsWith

        String s11 = "New Jersey";
        String s12 = "z";
        System.out.println("is s11 ends with s12: " + s11.endsWith(s12));
        System.out.println("is s11 ends with y : " + s11.endsWith("y"));
        boolean b1 = s11.endsWith("ey");
        System.out.println(b1);
        System.out.println("is s11 ends with ey: " + b1);


        // startWith
        String s13 = "New Jersey";
        String s14 = "z";
        System.out.println("is s13 start with s14: " + s13.startsWith(s14));
        System.out.println("is s13 start with N : " + s11.startsWith("N"));

        // indexOF
        String s15 = "I love java";
        System.out.println("What is the index of j?-- Answer is " + s15.indexOf("j"));

        // charAt. if i need to know one position with character then isthere then i need to use chr at

        String s16 = "I love java";
        System.out.println("What is the position for the  5?-- Answer is " + s16.charAt(5));




    }
}
