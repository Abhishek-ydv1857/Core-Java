import java.util.Scanner;

public class SwapFirstLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        String numStr = String.valueOf(num);

        if (numStr.length() == 1) {
            System.out.println("Swapped number: " + num);
        } else {
            char[] digits = numStr.toCharArray();
            char temp = digits[0];
            digits[0] = digits[digits.length - 1];
            digits[digits.length - 1] = temp;
            System.out.println("Swapped number: " + new String(digits));
        }

        scanner.close();
    }
}
