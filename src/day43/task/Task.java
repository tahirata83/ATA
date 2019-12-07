package day43.task;

import day43.example.overriding.Animal;
import day43.example.overriding.Cat;
import day43.example.overriding.Dog;
import day43.example.overriding.Fox;

import java.util.ArrayList;
import java.util.List;

public class Task {
    //create class Dog
    //create class Fox
    // override method sound
    // and print every animals sound

    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal fox = new Fox();
        cat.sound();
        dog.sound();
        fox.sound();
        System.out.println("----------------------------------------");

        Animal[] animals = {new Cat(), new Dog(), new Fox()};
        for (Animal animal : animals) {
            animal.sound();
        }

    }

}