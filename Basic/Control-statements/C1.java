import java.util.Scanner;

public class C1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your income: ");
        double income = scanner.nextDouble();

        double tax = 0;

        if (income <= 10000) {
            tax = 0; // No tax for income less than or equal to 10,000
        } else if (income > 10000 && income <= 30000) {
            tax = income * 0.10; // 10% tax for income between 10,001 and 30,000
        } else if (income > 30000 && income <= 50000) {
            tax = income * 0.20; // 20% tax for income between 30,001 and 50,000
        } else if (income > 50000) {
            tax = income * 0.30; // 30% tax for income above 50,000
        }

        System.out.println("Income: " + income);
        System.out.println("Tax to be paid: " + tax);

        scanner.close();
    }
}
