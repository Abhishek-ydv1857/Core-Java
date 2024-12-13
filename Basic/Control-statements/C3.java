import java.util.Scanner;

public class C3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the time of day (morning, afternoon, evening): ");
        String timeOfDay = scanner.nextLine().toLowerCase();

        if (timeOfDay.equals("morning")) {
            System.out.println("Good Morning!");
        } else if (timeOfDay.equals("afternoon")) {
            System.out.println("Good Afternoon!");
        } else if (timeOfDay.equals("evening")) {
            System.out.println("Good Evening!");
        } else {
            System.out.println("Invalid time of day entered.");
        }

        scanner.close();
    }
}
