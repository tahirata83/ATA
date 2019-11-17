package officeHours;

public class OfficeHour1 {

    public static void main(String[] args) {

        // don't use keywords which is taken by java
        //        int final = 11; will not work
        // example 1
        int i1 = 11;
        int i2 = 20;
        int result = i1 +  i2;
        System.out.println("result is here" + result);

        // example 2
        int i3 = 100;
        int i4 = 200;
        int result2 = i3  - i4;
        System.out.println("result2 is here line 20 ->     "+ result2);

    // example 3
        int i5 = 200;           // int is using for the whole number
        double d1 = 200;         // double is for the decimal numbers
        double d2 = 300;

        double result3= d1 / d2;   // if you are working with double your result variable type
                                    // also should be double
        System.out.println("result3 is here ->     "+result3);

        // example 4
        double d3 = 10;
        double d4 = 20;
        double result4= d3 * d4;
        System.out.println("result4 is here ->     "+result4);
        System.out.println("---------------------------------");

        // example 5
        int i6 = 25;
        int i7 = 7;
        int result5 = i6 % i7;
        System.out.println("result5 is here ->    " + result5);

        // example 6
        int i8 = 100;
        int discount = 50;
        int result6 = i8%discount;
        System.out.println("result6 is here ->      " + result6);

        // example 7

        boolean b1 =true;
        boolean b2 =false;
        System.out.println("b1 is here ->      " + b1);


        // example 8

         int i9 = 100;
        int discount1 = 50;
        boolean b3 =i9>discount1;

        System.out.println("b3 is here ->      " + b3);

        // example 9- A

        int in1 = 14;
        int in2 = 4;
        int result7 = in1%in2;

        boolean b4 =result7==0;

        System.out.println("b4 is here ->      " + b4);

        // example 9- B

        int in3 = 14;
        int in4 = 4;
        int result8 = in3%in4;

        boolean b5 =result8==2;

        System.out.println("b5 is here ->      " + b5);


        //   =(is equal.)  and   ==(is equal to zero?)

       // example 10
        double d5 = 120;
        double d6 = 10;

        double result9= d5 * d6;

        // boththis 2 ways will work
        boolean b6 =result9 > 2000;
        boolean b7 =d5 * d6 > 2000;

        System.out.println("b6 is here ->      " + b6);
        System.out.println("b7 is here ->      " + b7);

        System.out.println("----------------------------------" );


        // example 11

         char c1 = 'a';
         char c2 = '2';
         char c3 = '/';
         char c4 = '*';

        System.out.println("----------------------------------" );
        // example 12
        int in5 = 10;
        int in6 = 20;
        int result10 = in5+in6;

        System.out.println("result10 is here ->     "+result10);

         in5 = 30;
         result10 = in5+in6;

        System.out.println("result10 is here ->     "+result10);
        System.out.println(+in5 + " " + in6);
        System.out.println(" in5 is here = "+in5 + " " + " in6 is here = " + in6);
        System.out.println(" "+in5+ in6);


    }

}
