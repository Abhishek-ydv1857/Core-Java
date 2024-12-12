import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char input = scanner.next().charAt(0);

        if (Character.isLetter(input)) {
            System.out.println(input + " is an alphabet.");
        } else if (Character.isDigit(input)) {
            System.out.println(input + " is a digit.");
        } else {
            System.out.println(input + " is neither an alphabet nor a digit.");
        }

        scanner.close();
    }
}
