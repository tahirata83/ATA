package day3;

public class DataTypes {


    public static void main(String[] args) {

        int myInteger = 9;
        float myFloatNum = 883.34f;
        char myLetter = 'a';
        boolean myBool = false;


        byte minByte = - 128;
        byte maxbyte= 127;

        int minInteger = -2147483647;
        int maxInteger = 2147483647;

        long larger = maxInteger + 1L;



        int a = 2147483647;
        int b = 2147483647;
        long result = (long)a + (long)b;
        System.out.println(result);


        int m = 10;
        int n = 3;
        System.out.println(m/n);

        int x = 10;
        int y = 3;
        long result1 = (long)x + (long)y;
        System.out.println(result1);

        int p = 10;
        int q = 3;
        float result2 = (float)p / (float)q;
        System.out.println(result2);

        int e = 123;
        int f = 323;
        int g = 34584;

        System.out.println((float)(e + f + g)/3);

        double h = 23.4;
        double i = 24.0;
        double j = 12;
        double k = 450.3;
        double l = 123000.234;
         double result3 = (h + i + j + k +l)/5;
        System.out.println("average of these number is" + result3);



        int a1 = 4;
        int a2 = 5;




    }
}