package day8;

public class ifClass {
    public static void main(String[] args) {
        boolean statement = false;
        if (statement) {
            System.out.println("statement is true");
        }

        int year = 2000;
        if (year >= 2000) ;
        {

            System.out.println("It's 20th century");
        }
        if (year == 2000) {
            System.out.println("It's millenium");
        }
        if (year < 2000) {
            System.out.println("It's 19'th century");
        }


        int temperature = 100;
        if (temperature >= 70) {
            System.out.println("It's hot");
        }

        if (temperature < 70 && temperature >= 60) {
            System.out.println("It's warm");
        }
        if (temperature < 60 && temperature >= 20) {
            System.out.println("Cool");
        }
        if (temperature < 20) {
            System.out.println("Freezing");
        }
        int A = 40;
        if(A%2 ==0){
            System.out.println("it is even");

        }

        int B = 41;
        if(A%2 !=0); {
            System.out.println("it is odd");
        }

    // 1.write a program that checks whether number is positive or negative
    // ex. 1 => positive
    // ex . -100 => negative
    // hint /: N> 0 => positive, N < 0 = . negative

    // 2. wrie a program that check whether number is even or odd
    // ex. 2 => even

        double number = 7;
                if(number > 0.0 );
        System.out.println(number + " is positive");

        double number2 = -5;
        if(number2 < 0.0 );
        System.out.println(number2 + " is negative");

        double number3 = -0.8;
        double number4 = 5.8;
        double result =  number3/3 + number4/7;

        System.out.println(" calculate" + result);


       int p = 4;
       int q = -5;

       int product = p*q;
        System.out.println(" result" + product);


        int m = 7;
                if ( m/1 == m && m/7 == 1 );
        System.out.println(m + " is prime number");


        int n = 5;
        if ( n/1 == 5 && m/5 == 1 );
        System.out.println( " is prime number" + n);



    }

}