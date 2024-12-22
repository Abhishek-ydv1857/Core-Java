
public class LetterAsteriskPattern {
    public static void main(String[] args) {
        char letter = 'E';  // Start from letter 'E'
        int n = 5;  // Number of rows
        
        for (int i = 0; i < n; i++) {
            // Print asterisks
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            // Print letters
            for (int j = i; j < n - 1; j++) {
                System.out.print(letter + " ");
            }
            // Move to the next line
            System.out.println();
            letter--;  // Move to the previous letter
        }
    }
}
