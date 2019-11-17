
package day16;

public class NestedLoopTask4 {
    //TODO Write program that prints this using loops
    // *****
    //  ****
    //   ***
    //
    //     *
    public static void main(String[] args) {
        System.out.println("HARD CODED -------------------------");
        System.out.println("*****");
        System.out.println(" ****");
        System.out.println("  ***");
        System.out.println("   ");
        System.out.println("    *");

        System.out.println("USING LOOPS ----------------------");
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();




    }for (int i = 5; i >= 0; i--) {
            for (int j = 5; j >= 0; j--) {
                if (j <= i) {
                    System.out.print("*");
                }

            }
            System.out.println();

        }


}}