import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] fruits = new String[10];

        System.out.println("Enter 10 fruit names:");
        for (int i = 0; i < fruits.length; i++) {
            fruits[i] = scanner.nextLine();
        }

        int appleCount = 0;
        for (String fruit : fruits) {
            if (fruit.equalsIgnoreCase("apple")) {
                appleCount++;
            }
        }

        System.out.println("Total 'apple' count: " + appleCount);
        scanner.close();
    }
}
