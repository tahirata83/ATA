package day22_Practice;




public class Task9 {
    //write a java program that iterates an array using while-loop
    public static void main(String[] args) {
        int[] intArray = {100, 2, 4, 5, 6, 7, 8, 9, 10};

        int i = 0;
        while (i < intArray.length) {
            System.out.print(intArray[i] + " ");
            i++;
        }

        // ex. output:
        // 100 2 4 5 6 7 8 9 10
    }
}