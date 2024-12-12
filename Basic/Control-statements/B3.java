import java.util.Scanner;

public class B3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 'A' for Area or 'V' for Volume: ");
        char choice = scanner.next().charAt(0);

        if (choice == 'A' || choice == 'a') {
            System.out.println("Choose a shape to calculate area:");
            System.out.println("1) Triangle");
            System.out.println("2) Square");
            System.out.println("3) Rectangle");
            int shapeChoice = scanner.nextInt();

            switch (shapeChoice) {
                case 1:
                    System.out.print("Enter the base of the triangle: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the height of the triangle: ");
                    double height = scanner.nextDouble();
                    double triangleArea = 0.5 * base * height;
                    System.out.println("Area of the triangle: " + triangleArea);
                    break;

                case 2:
                    System.out.print("Enter the side length of the square: ");
                    double side = scanner.nextDouble();
                    double squareArea = side * side;
                    System.out.println("Area of the square: " + squareArea);
                    break;

                case 3:
                    System.out.print("Enter the length of the rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    double width = scanner.nextDouble();
                    double rectangleArea = length * width;
                    System.out.println("Area of the rectangle: " + rectangleArea);
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } else if (choice == 'V' || choice == 'v') {
            System.out.println("Choose a shape to calculate volume:");
            System.out.println("1) Cube");
            System.out.println("2) Rectangular Prism");
            int volumeChoice = scanner.nextInt();

            switch (volumeChoice) {
                case 1:
                    System.out.print("Enter the side length of the cube: ");
                    double sideLength = scanner.nextDouble();
                    double cubeVolume = Math.pow(sideLength, 3);
                    System.out.println("Volume of the cube: " + cubeVolume);
                    break;

                case 2:
                    System.out.print("Enter the length of the rectangular prism: ");
                    double prismLength = scanner.nextDouble();
                    System.out.print("Enter the width of the rectangular prism: ");
                    double prismWidth = scanner.nextDouble();
                    System.out.print("Enter the height of the rectangular prism: ");
                    double prismHeight = scanner.nextDouble();
                    double prismVolume = prismLength * prismWidth * prismHeight;
                    System.out.println("Volume of the rectangular prism: " + prismVolume);
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } else {
            System.out.println("Invalid input!");
        }

        scanner.close();
    }
}
