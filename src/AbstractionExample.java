abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with a key");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Car car = new Car();

        car.start();
    }
}