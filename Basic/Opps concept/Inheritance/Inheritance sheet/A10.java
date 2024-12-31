class Vehicle {
    private String type;

    public Vehicle(String type) {
        this.type = type;
    }

    public void displayType() {
        System.out.println("Vehicle Type: " + type);
    }
}

class Car extends Vehicle {
    private int doors;

    public Car(String type, int doors) {
        super(type);
        this.doors = doors;
    }

    public void displayCarDetails() {
        System.out.println("Car with " + doors + " doors.");
    }
}

class SportsCar extends Car {
    private int topSpeed;

    public SportsCar(String type, int doors, int topSpeed) {
        super(type, doors);
        this.topSpeed = topSpeed;
    }

    public void displayPerformance() {
        System.out.println("Sports car with a top speed of " + topSpeed + " km/h.");
    }
}

public class A10 {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar("Sports Car", 2, 320);
        sportsCar.displayType();
        sportsCar.displayCarDetails();
        sportsCar.displayPerformance();
    }
}
