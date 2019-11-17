package day32.task;


import day32.example.sub.Animal;

public class taskAnimal {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();

        Animal cat = new Animal();
        cat.legs = 4;
        cat.age = 5;
        cat.weight = 4;
        cat.name = "Tony";
        cat.poisonous = false;
       cat.breed = "I dont know";
        cat.cuteness();
        int speed = cat.getSpeed();
        System.out.println("Speed of tiger: " + speed);




    }}
