package day33;



import java.util.ArrayList;

public class Car1 {
    public static void main(String[] args) {
        System.out.println(" car");
    }
    public int speed;


    public int wheels;
    public String model;
    public String color;
    public double engine;
    public String state; // new or old
    public String name;
    public int count;

    public boolean drive() {
        if (wheels > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void repair() {
        if (state.equals("NEW")) {
            System.out.println("Its new, you dont have to repair it");
        } else {
            System.out.println("You might think about repairing it");
        }
    }

}
