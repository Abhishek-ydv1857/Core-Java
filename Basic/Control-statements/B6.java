import java.util.Scanner;

public class B6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the height of the person (in cm): ");
        double heightCm = scanner.nextDouble();

        double heightMeters = heightCm / 100.0;

        String category;
        if (heightCm < 150) {
            category = "Low";
        } else if (heightCm <= 180) {
            category = "Mid";
        } else {
            category = "High";
        }

        System.out.println("Height in meters: " + heightMeters + " m");
        System.out.println("Height category: " + category);

        scanner.close();
    }
}

