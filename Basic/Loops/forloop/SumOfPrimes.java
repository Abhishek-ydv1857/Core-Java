import java.util.Scanner;

public class SumOfPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 2; i <= n; i++) {
            if (PrimeNumbers.isPrime(i)) {
                sum += i;
            }
        }

        System.out.println("Sum of prime numbers between 1 and " + n + " is: " + sum);
    }
}
