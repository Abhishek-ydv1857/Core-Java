import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int input = scanner.nextInt();
        
        int numOfDigits = String.valueOf(Math.abs(input)).length();
        
        System.out.println("The number of digits in " + input + " is: " + numOfDigits);

    }
}
