import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of characters: ");
        int size = scanner.nextInt();
        char[] characters = new char[size];

        System.out.println("Enter " + size + " characters:");
        for (int i = 0; i < size; i++) {
            characters[i] = scanner.next().charAt(0);
        }

        int vowelCount = 0;
        for (char ch : characters) {
            if (isVowel(ch)) {
                vowelCount++;
            }
        }

        System.out.println("Total vowels: " + vowelCount);
        scanner.close();
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
