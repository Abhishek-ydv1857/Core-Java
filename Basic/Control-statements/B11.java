import java.util.Scanner;

public class B11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Number of Units Consumed: ");
        int units = scanner.nextInt();

        System.out.print("Enter Amount per Unit: ");
        double amountPerUnit = scanner.nextDouble();

        double amount = units * amountPerUnit;
        double discount = 0;

        if (units >= 1 && units <= 10) {
            discount = 0.10; // 10% discount
        } else if (units >= 11 && units <= 20) {
            discount = 0.15; // 15% discount
        } else if (units >= 21 && units <= 40) {
            discount = 0.30; // 30% discount
        } else if (units == 50) {
            discount = 0.50; // 50% discount
        }

        double discountAmount = amount * discount;
        double totalPayAmount = amount - discountAmount;

        System.out.println("\nOutput:");
        System.out.println("Name: " + name);
        System.out.println("Units Consumed: " + units);
        System.out.println("Amount: " + amount);
        System.out.println("Discount: " + (discount * 100) + "%");
        System.out.println("Total Pay Amount: " + totalPayAmount);

        scanner.close();
    }
}
