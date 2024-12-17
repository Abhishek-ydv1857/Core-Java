import java.util.Scanner;

public class LuckyNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the car no: ");
        String input = scanner.nextLine();

        // Check if the input is a valid 4-digit number
        if (input.length() == 4 && input.matches("[0-9]+")) {
            int carNumber = Integer.parseInt(input);

            // Check if the sum of digits is divisible by 3, 5, or 7
            int sumOfDigits = 0;
            while (carNumber > 0) {
                sumOfDigits += carNumber % 10;
                carNumber /= 10;
            }

            if (sumOfDigits % 3 == 0 || sumOfDigits % 5 == 0 || sumOfDigits % 7 == 0) {
                System.out.println("Lucky Number");
            } else {
                System.out.println("Sorry its not my lucky number");
            }
        } else {
            System.out.println(input + " is not a valid car number");
        }

        scanner.close();
    }
}
