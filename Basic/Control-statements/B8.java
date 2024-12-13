import java.util.Scanner;

public class B8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextDouble();
        }
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        double average = sum / 5;
        System.out.println("Average: " + average);
        if (average < 40) {
            System.out.println("Grade: Fail");
        } else if (average >= 45 && average < 50) {
            System.out.println("Grade: D");
        } else if (average >= 50 && average < 60) {
            System.out.println("Grade: C");
        } else if (average >= 60 && average < 80) {
            System.out.println("Grade: B");
        } else if (average >= 80) {
            System.out.println("Grade: A");
        }
        scanner.close();
    }
}
