package day2;

public class BooleanExample {
    public static void main(String[] args) {
        boolean bool = true;
        boolean bool2 = false;

        int number = 20;

        boolean isBiggerThan = number > 10;
        System.out.println(number + " > 10" + isBiggerThan);

        int number2 = -5;

        boolean isLessThan = number < 10;
        System.out.println(number + " < 10" + isLessThan);


        boolean falseBool = false;
        boolean trueBool = true;


        System.out.println(trueBool && trueBool);
        System.out.println(falseBool && trueBool);
        System.out.println(trueBool && falseBool);
        System.out.println(falseBool && falseBool);

    }
}