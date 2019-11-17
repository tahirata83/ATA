package day8;

import java.util.Scanner;

public class IfElse6 {
    // Task Evaluate result of exam
    // A => excellent
    // B => good
    // C => middle
    // D => pass
    // F => fail
    // TODO Hint: nextLine, String, equals, equalsIgnoreCase
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Provide a grade:");
        String grade = scan.nextLine();

        if(grade.equals("A")){
            System.out.println("excellent");
        } else if("B".equals(grade)){
            System.out.println("good");
        }else if("C".equals(grade)){
            System.out.println("good");
        }else if("D".equals(grade)){
            System.out.println("good");
        }else if("F".equals(grade)){
            System.out.println("good");
        }

    }
}




