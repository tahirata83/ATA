package day47.task;

public class Task2 {

    public static void main(String[] args) {

    }
}
interface Vehicle{
    int speed();

}
interface AirVehicle{
    void fly();
}

interface SeaVehicle{
    void move();
}
interface Aircraft{
    void turnAround();
}


class Car implements Vehicle {

    @Override
    public int speed() {
    return 40;
    }
}

class Tractor implements Vehicle {

    @Override
    public int speed() {
        return 40;
    }


}

class Plane implements Vehicle, AirVehicle{

    @Override
    public int speed() {
        return 40;
    }
    @Override
    public void fly() {
        System.out.println("Flying");
    }

    class Ship implements Vehicle, SeaVehicle{

        @Override
        public int speed() {
            return 40;
        }
        @Override
        public void move() {
            System.out.println("Moving");
        }
}
    class SpaceShip implements AirVehicle, Aircraft{

        @Override
        public void fly() {
            System.out.println("Flying");
        }
        @Override
        public void turnAround() {
            System.out.println("Turning Around");
        }
    }

}