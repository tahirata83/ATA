package day41.task;

public class Dog extends day41.task.Animal {

    public String sound = "bark";

    public Dog(String name, int age, String sound) {
        super(name, age);
        this.sound = sound;
    }
//    inherit from animal and add sound bark
}