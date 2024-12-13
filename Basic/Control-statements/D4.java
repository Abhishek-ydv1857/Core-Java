import java.util.Scanner;

public class D4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two numbers followed by '+': ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        String operator = scanner.next();

        if (operator.equals("+")) {
            double result = num1 + num2;
            System.out.println("Result: " + result);
        } else {
            System.out.println("Invalid operator. Only '+' is supported.");
        }

        scanner.close();
    }
}
