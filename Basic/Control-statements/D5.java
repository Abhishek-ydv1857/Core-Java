import java.util.Scanner;

public class D5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter 'v' to check if voter ID is valid: ");
        char voterIDCheck = scanner.next().charAt(0);

        if (age >= 18) {
            if (voterIDCheck == 'v' || voterIDCheck == 'V') {
                System.out.println("You are eligible to vote.");
            } else {
                System.out.println("Invalid voter ID. You cannot vote.");
            }
        } else {
            System.out.println("You are not eligible to vote due to age restrictions.");
        }

        scanner.close();
    }
}
