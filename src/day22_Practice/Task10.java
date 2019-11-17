package day22_Practice;

public class Task10 {
    public static void main(String[] args) {
        int[] intArray = {100, 2, 4, 5, 6, 7, 8, 9, 10};

        int i = intArray.length-1;
        while  (i >= 0) {
            System.out.print(intArray[i] + " ");
            i--;
        }

        // ex. output:
        // 100 2 4 5 6 7 8 9 10
    }
}

