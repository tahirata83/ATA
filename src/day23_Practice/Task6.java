package day23_Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Task6 {
    // Given an array of ints,
    // print true if it contains no 1's or it contains no 4's.

    // {1,2,3} => true
    // {2,3,4} => true
    // {1,2,4} => false

    public static void main(String[] args) {
        int [] a = {1,2,4};

        boolean have1=false;
        boolean have4=false;

        for(int i=0;i<a.length;i++) {

            if(a[i]==1) {

                have1=true;

            }else if(a[i]==4 )  {

                have4=true;

            }

        }
        if(have1==true && have4==true) {
            System.out.println("false");
        }else {
            System.out.println("true");
        }
    }

}

