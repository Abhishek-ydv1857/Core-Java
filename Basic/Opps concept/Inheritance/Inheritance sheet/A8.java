class Vehicle {
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public void displayName() {
        System.out.println("Vehicle: " + name);
    }
}

class Car extends Vehicle {
    public Car(String name) {
        super(name);
    }

    public void drive() {
        System.out.println("Method of transportation: Driving on roads.");
    }
}

class Bike extends Vehicle {
    public Bike(String name) {
        super(name);
    }

    public void ride() {
        System.out.println("Method of transportation: Riding on two wheels.");
    }
}

public class A8 {
    public static void main(String[] args) {
        Car car = new Car("Sedan");
        car.displayName();
        car.drive();

        System.out.println();

        Bike bike = new Bike("Mountain Bike");
        bike.displayName();
        bike.ride();
    }
}
