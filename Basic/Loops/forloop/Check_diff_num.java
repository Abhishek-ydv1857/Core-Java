
import java.util.Scanner;

public class Check_diff_num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a type of check:");
        System.out.println("1. Armstrong");
        System.out.println("2. Palindrome");
        System.out.println("3. Reverse");
        System.out.print("Enter your choice (1, 2, or 3): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter a number to check if it is an Armstrong number: ");
            int num = scanner.nextInt();
            int temp = num, sum = 0, digits = 0;

            while (temp != 0) {
                temp /= 10;
                digits++;
            }

            temp = num;

            while (temp != 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }

            if (sum == num) {
                System.out.println(num + " is an Armstrong number.");
            } else {
                System.out.println(num + " is not an Armstrong number.");
            }

        } else if (choice == 2) {
            System.out.print("Enter a number to check if it is a Palindrome: ");
            int num = scanner.nextInt();
            int originalNum = num, reversedNum = 0;

            while (num != 0) {
                int digit = num % 10;
                reversedNum = reversedNum * 10 + digit;
                num /= 10;
            }

            if (originalNum == reversedNum) {
                System.out.println(originalNum + " is a Palindrome.");
            } else {
                System.out.println(originalNum + " is not a Palindrome.");
            }

        } else if (choice == 3) {
            System.out.print("Enter a number to check its reverse: ");
            int num = scanner.nextInt();
            int reversedNum = 0;

            while (num != 0) {
                int digit = num % 10;
                reversedNum = reversedNum * 10 + digit;
                num /= 10;
            }

            System.out.println("The reverse of the number is: " + reversedNum);
        } else {
            System.out.println("Invalid choice. Please enter 1, 2, or 3.");
        }

        scanner.close();
    }
}
