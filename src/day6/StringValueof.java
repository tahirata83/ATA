package day6;



public class StringValueof {
    public static void main(String[] args) {
    // valueOf() which can be used to convert a number to a String
    // Converting integer to String
    int number = 10;
    String s1 = String.valueOf(number);
        System.out.println(s1 + 10); //"10" + 10 => 1010
        System.out.println("10" + 10);
        System.out.println(number + 10); // 20

    // Converting String to integer
        String s2 = "30";
        int n2 = Integer.valueOf(s2);
        // 30 + 10 => 40
        System.out.println(s2+10); // "30" + 10 => "3010"
        System.out.println(n2+10); // 30 + 10 => 40

        String s3 = "100";
        String s4 = "300";
        int n3 = Integer.valueOf(s3);
        int n4 = Integer.valueOf(s4);
        System.out.println(n3 + n4);

        String s5 = "5";
        String s6 = "22";
        double n5 = 50;
        double n6 = 2.24;
        double n7 = 50000;


        double n8 = Integer.valueOf(s5);
        double n9 = Integer.valueOf(s6);
        System.out.println((n5 + n6 + n7 + n8 + n9)/5);

        String v1 = "22";
        int v2 = 50;
        double v3 = 50;
        String v4 = "22";
        int v5 =50000;
        double average = (Integer.valueOf(v1) + v2 + v3 + Integer.valueOf(v4) + v5);
        System.out.println(average);




    }


}