package day7;

public class mathRandom3 {
    //int randomInRange = min + (int) (Math.random() * ((max - min) + 1));

    public static void main(String[] args) {
        int min = 10;
        int max = 15;
        int range = max - min;

        int randomInRange = min + (int) (Math.random() * (range + 1));
        System.out.println(randomInRange);

        System.out.println("============================================");



        int min1 = 0;
        int max1 = 3;
        int range1 = max1 - min1;

        int randomInRange1 = min1 + (int) (Math.random() * (range1 + 1));
        System.out.println(randomInRange1);

        if(randomInRange1 == 0){
            System.out.println("zero");
        }

        if(randomInRange1 == 1) {
            System.out.println("One");
        }
            if(randomInRange1 == 2) {
                System.out.println("two");
            }
        if(randomInRange1 == 3){
            System.out.println("three");
        }

        System.out.println("=================================================");

        int min2 = -200;
        int max2 = 200;
        int range2 = max2 - min2;

        int randomInRange2 = min2 + (int) (Math.random() * (range2 + 1));
        System.out.println(randomInRange1);

        if(randomInRange2 <= 0){
            System.out.println("negative");
        }

        if(randomInRange2 >= 0) {
            System.out.println("pozirtive");
        }

        System.out.println("=================================================");

        int min3 = -200;
        int max3 = 200;
        int range3 = max2 - min2;

        int randomInRange3 = min3 + (int) (Math.random() * (range3 + 1));
        System.out.println(randomInRange1);

        if(randomInRange %2== 0){
            System.out.println("even");
        }

        if(randomInRange %2!= 0) {
            System.out.println("odd");


        }

    }}
