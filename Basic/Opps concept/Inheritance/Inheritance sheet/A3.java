class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public void displayColor() {
        System.out.println("The color of this shape is: " + color);
    }

    public double calculateArea() {
        return 0.0;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public void displayRadius() {
        System.out.println("The radius of the circle is: " + radius);
    }
}

class Square extends Shape {
    private double sideLength;

    public Square(String color, double sideLength) {
        super(color);
        this.sideLength = sideLength;
    }

    @Override
    public double calculateArea() {
        return sideLength * sideLength;
    }

    public void displaySideLength() {
        System.out.println("The side length of the square is: " + sideLength);
    }
}

public class A3 {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5.0);
        circle.displayColor();
        circle.displayRadius();
        System.out.println("The area of the circle is: " + circle.calculateArea());

        System.out.println();

        Square square = new Square("Blue", 4.0);
        square.displayColor();
        square.displaySideLength();
        System.out.println("The area of the square is: " + square.calculateArea());
    }
}
