package day22_Practice;

    // 4. Write a Java program to test if an array contains a specific value

public class Task4 {
    public static void main(String[] args) {


        int[] num = {1, 2, 3, 4, 5};
        int num2 = 3;
        boolean a = false;
        for (int n : num) {
            if (n == num2) {
                a = true;

                System.out.println(num2 );

            }
        }
        int[] arr = {1, 23, 34, 45, 34, 645, 6, 45};
        for (int num3 : arr) { // for-each loop
            if(num3 == 6){
                System.out.println("I have it");
            }
        }
    }

    }