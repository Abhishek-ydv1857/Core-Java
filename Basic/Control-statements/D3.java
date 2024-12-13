import java.util.Scanner;

public class D3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int result = (number % 2 == 0) ? 1 : 2;

        switch (result) {
            case 1:
                System.out.println("1: Even number");
                break;
            case 2:
                System.out.println("2: Odd number");
                break;
        }

        scanner.close();
    }
}
