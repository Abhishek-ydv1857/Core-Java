import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        System.out.print("Enter the operation (factorial or reverse): ");
        String operation = scanner.next();
        
        if (operation.equalsIgnoreCase("factorial")) {
            long factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + num + " is: " + factorial);
            
        } else if (operation.equalsIgnoreCase("reverse")) {
            int reversedNum = 0;
            int originalNum = num;
            
            while (num != 0) {
                int digit = num % 10;
                reversedNum = reversedNum * 10 + digit;
                num /= 10;
            }
            
            System.out.println("The reverse of " + originalNum + " is: " + reversedNum);
            
        } else {
            System.out.println("Invalid operation. Please enter 'factorial' or 'reverse'.");
        }
        
        scanner.close();
    }
}
