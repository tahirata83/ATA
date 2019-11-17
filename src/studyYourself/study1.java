package studyYourself;

import java.util.Scanner;

public class study1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz " );
        int num = scan.nextInt();
        int faktoriyel = 1;
        while (num >= 1){
         faktoriyel = faktoriyel * num;



        num--;
            System.out.println("faktoriyel = " + faktoriyel);

        }
        System.out.println("======================================================================================= " );




    }
}


