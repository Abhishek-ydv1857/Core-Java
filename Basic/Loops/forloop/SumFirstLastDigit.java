import java.util.Scanner;

public class SumFirstLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int lastDigit = num % 10;
        while (num >= 10) {
            num /= 10;
        }
        int firstDigit = num;

        int sum = firstDigit + lastDigit;

        System.out.println("Sum of first and last digit: " + sum);
        scanner.close();
    }
}
