import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Prime factors of " + num + " are:");
        for (int i = 2; i <= num; i++) {
            while (num % i == 0 && PrimeNumbers.isPrime(i)) {
                System.out.print(i + " ");
                num /= i;
            }
        }
    }
}
