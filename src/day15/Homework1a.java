package day15;

public class Homework1a {
    public static void main(String[] args) {
        int [] a = {1, 4, 7, 9, 2};
        int evencounter = 0;

        for (int i = 0; i < a.length ; i++) {
            if (a[i] %2 == 0){          // needd to count how many int

                evencounter++;
            }

        }
        System.out.println("you have " + evencounter);
    }
}

