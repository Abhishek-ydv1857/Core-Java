import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int intVar = scanner.nextInt();

        System.out.print("Enter a float: ");
        float floatVar = scanner.nextFloat();

        System.out.print("Enter a double: ");
        double doubleVar = scanner.nextDouble();

        System.out.print("Enter a character: ");
        char charVar = scanner.next().charAt(0);

        System.out.print("Enter a long integer: ");
        long longVar = scanner.nextLong();

        System.out.println("\nYou entered:");
        System.out.println("Integer: " + intVar);
        System.out.println("Float: " + floatVar);
        System.out.println("Double: " + doubleVar);
        System.out.println("Character: " + charVar);
        System.out.println("Long Integer: " + longVar);

        scanner.close();
    }
}
