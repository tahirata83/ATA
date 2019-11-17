package day11;

public class ForEx2 {

    public static void main(String[] args) {
     // get average


                int N = 0;
                int sum = 0;

                for (int i = 1; i <= 6; i++) {
                    sum = sum + i;
                    N++;
                }

                System.out.println("Sum is :" + sum);
                System.out.println("Average is : " + ((double)sum/N));
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++=" );

        int counter = 0;
        int sum1 = 0;
        for(int i = 1; i <= 10; i = i + 3){
            System.out.println(i);
            sum1 += i; // same as sum = sum + i;
            counter++; // same as counter = counter + 1;
        }

        System.out.println("sum from 1 to 10 with +3 is " + sum1);
        System.out.println("counter is " + counter);

        System.out.println((double) sum1 / counter);


        int m = 0;
        int sum2 = 0;
        for( m = 0; m <= 5; m = m + 1){
            System.out.println(m);
            sum2 += m; // same as sum = sum + i;

        }

        System.out.println("sum is " + sum2);





    }
    }












