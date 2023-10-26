
class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void start() {
        System.out.println(brand + " is starting.");
    }

    void stop() {
        System.out.println(brand + " is stopping.");
    }
}

class Car extends Vehicle {
    Car(String brand) {
        super(brand);
    }

    void drive() {
        System.out.println(brand + " is driving.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota");
        myCar.start();  // Inherited from Vehicle
        myCar.drive();  // Defined in Car
        myCar.stop();   // Inherited from Vehicle
    }
}
