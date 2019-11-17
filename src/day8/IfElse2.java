package day8;

public class IfElse2 {
    public static void main(String[] args) {
        String s1 = "Hello";

        if(s1.length() == 5){
            System.out.println("its have enough length");
        } else if(s1.contains("o")){
            System.out.println("it has o");
        } else {
            System.out.println("ignore this");
        }


        int number = 2;

        if(number > 5){
            System.out.println("Number is bigger than 5");
        }
       else if(number > 3){
            System.out.println("Number is bigger than 3");
        }
        else {
            System.out.println("Number is less than 3");
        }







        String s2 = "Tahor";

        if(s2.length() == 5){
            System.out.println("Pretty name");
        } else if(s2.contains("y")){
            System.out.println("it has y");
        } else {
            System.out.println("ignore this");
        }










    }
}












