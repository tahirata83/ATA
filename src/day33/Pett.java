package day33;
import day32.example.sub.Animal;

public class Pett
{

    public static void main(String[] args) {
        Animal tiger = new Animal();
        tiger.legs = 4;
        tiger.age = 5;
        tiger.weight = 200.10;
        tiger.name = "Richard Parker";
        tiger.poisonous = false;
        tiger.breed = "Bangal";
        tiger.cuteness();
        int speed = tiger.getSpeed();
        System.out.println("Speed of animal: " + speed);
        System.out.println("Can my animal juump?: " + tiger.canJump());

        String output = tiger.toString();
        System.out.println("----------------------------------");
        System.out.println(output);
    }
}
