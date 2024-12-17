import java.util.Scanner;

public class EvenOddRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter 'even' or 'odd': ");
        String choice = scanner.next();
        
        if (choice.equalsIgnoreCase("odd")) {
            System.out.print("Enter the range (start and end): ");
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            
            System.out.println("Odd numbers between " + start + " and " + end + ":");
            for (int i = start; i <= end; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
            
            System.out.println("Even numbers between " + start + " and " + end + ":");
            for (int i = start; i <= end; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
            
        } else if (choice.equalsIgnoreCase("even")) {
            System.out.println("You selected even, no range input needed.");
        } else {
            System.out.println("Invalid input. Please enter 'even' or 'odd'.");
        }
        
    }
}
