import java.util.Scanner;

public class C4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to our Restaurant!");
        System.out.println("Please choose an item from the menu:");
        System.out.println("1. Pizza - $12");
        System.out.println("2. Burger - $8");
        System.out.println("3. Pasta - $10");

        System.out.print("Enter your choice (1-3): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("You selected Pizza. Price: $12");
        } else if (choice == 2) {
            System.out.println("You selected Burger. Price: $8");
        } else if (choice == 3) {
            System.out.println("You selected Pasta. Price: $10");
        } else {
            System.out.println("Invalid choice. Please select a valid option (1-3).");
        }

        scanner.close();
    }
}
