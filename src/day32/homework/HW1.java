package day32.homework;



public class HW1 {

    public static void main(String[] args) {

        buyItem("milk");
        buyItem("water");
        buyItem("sugar");
        buyItem("tea");

        }

public static String  buyItem (String a) {
    System.out.println("I go to store and bought a " + a);
    return "I go to store and bought a " + a;
}   }