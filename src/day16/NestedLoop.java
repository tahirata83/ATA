package day16;

public class NestedLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println("\n--------------");
        }
        //rows and columns
        //*****
        //*****
        //*****
        //*****
        //*****
        System.out.println("============================================================================================");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println("\n--------------");
        }



        System.out.println("============================================================================================");

        for (int a = 0; a < 10; a++) {
            System.out.println("category: " + a); // Automative & Wheel
            for (int b = 0; b < 10; b++) {
                System.out.println("item: " + b + " of category: " + a); // Wheel
                for (int k = 0; k < 5; k++) {
                    System.out.println("detail: " + k + " of item: " + b); // General Grabber AT2 Radial
                }
                System.out.println();
            }
            System.out.println();
        }












    }
}


