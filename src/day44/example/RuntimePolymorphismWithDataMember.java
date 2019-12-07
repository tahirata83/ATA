package day44.example;

public class RuntimePolymorphismWithDataMember {
    public static void main(String args[]) {
        Bike obj = new Honda();
        System.out.println(obj.speedlimit);//90
    }
}

class Bike {
    int speedlimit = 90;
}

class Honda extends Bike {
    int speedlimit = 150;
}