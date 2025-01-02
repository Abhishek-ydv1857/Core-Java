class Shape {
    double area;

    public void calculateArea() {
        System.out.println("Area not defined for this shape.");
    }

    public void displayArea() {
        System.out.println("Area: " + area);
    }
}

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        area = Math.PI * radius * radius;
    }

    public void displayRadius() {
        System.out.println("Radius: " + radius);
    }
}

class Square extends Shape {
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void calculateArea() {
        area = side * side;
    }

    public void displaySide() {
        System.out.println("Side: " + side);
    }
}

public class B1 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.calculateArea();
        circle.displayArea();
        circle.displayRadius();

        Square square = new Square(4);
        square.calculateArea();
        square.displayArea();
        square.displaySide();
    }
}
