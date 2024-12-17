import java.util.Scanner;

public class NumberOperationss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the operation (neon, perfect, prime, count, sumofdigit, fibonacci): ");
        String operation = scanner.nextLine().toLowerCase();

        if (operation.equals("neon")) {
            System.out.print("Enter a number to check if it is a neon number: ");
            int num = scanner.nextInt();
            int square = num * num;
            int sum = 0;
            while (square != 0) {
                sum += square % 10;
                square /= 10;
            }
            if (sum == num) {
                System.out.println(num + " is a neon number.");
            } else {
                System.out.println(num + " is not a neon number.");
            }

        } else if (operation.equals("perfect")) {
            System.out.print("Enter a number to check if it is a perfect number: ");
            int num = scanner.nextInt();
            int sum = 0;
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            if (sum == num) {
                System.out.println(num + " is a perfect number.");
            } else {
                System.out.println(num + " is not a perfect number.");
            }

        } else if (operation.equals("prime")) {
            System.out.print("Enter 'one' to check if a number is prime or 'more' to print prime numbers between 1 and 100: ");
            String primeChoice = scanner.next();
            
            if (primeChoice.equals("one")) {
                System.out.print("Enter a number to check if it is prime: ");
                int num = scanner.nextInt();
                boolean isPrime = true;
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (num > 1 && isPrime) {
                    System.out.println(num + " is a prime number.");
                } else {
                    System.out.println(num + " is not a prime number.");
                }
            } else if (primeChoice.equals("more")) {
                System.out.println("Prime numbers between 1 and 100:");
                for (int i = 2; i <= 100; i++) {
                    boolean isPrime = true;
                    for (int j = 2; j <= Math.sqrt(i); j++) {
                        if (i % j == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) {
                        System.out.print(i + " ");
                    }
                }
                System.out.println();
            }

        } else if (operation.equals("count") || operation.equals("sumofdigit")) {
            System.out.print("Enter a one-digit number: ");
            int num = scanner.nextInt();
            if (operation.equals("count")) {
                int count = 0;
                while (num != 0) {
                    num /= 10;
                    count++;
                }
                System.out.println("The count of digits is: " + count);
            } else if (operation.equals("sumofdigit")) {
                int sum = 0;
                while (num != 0) {
                    sum += num % 10;
                    num /= 10;
                }
                System.out.println("The sum of digits is: " + sum);
            }

        } else if (operation.equals("fibonacci")) {
            System.out.print("Enter 'lastnumber' to get the last Fibonacci number or 'series' to print the series: ");
            String fibonacciChoice = scanner.next();
            
            if (fibonacciChoice.equals("lastnumber")) {
                System.out.print("Enter the term number for the Fibonacci sequence: ");
                int n = scanner.nextInt();
                int a = 0, b = 1, c = 0;
                if (n == 1) {
                    c = a;
                } else if (n == 2) {
                    c = b;
                } else {
                    for (int i = 3; i <= n; i++) {
                        c = a + b;
                        a = b;
                        b = c;
                    }
                }
                System.out.println("The " + n + "th Fibonacci number is: " + c);
            } else if (fibonacciChoice.equals("series")) {
                System.out.print("Enter the number of terms for the Fibonacci series: ");
                int n = scanner.nextInt();
                int a = 0, b = 1;
                System.out.print("Fibonacci series: ");
                System.out.print(a + " " + b + " ");
                for (int i = 3; i <= n; i++) {
                    int c = a + b;
                    System.out.print(c + " ");
                    a = b;
                    b = c;
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid operation.");
        }

        scanner.close();
    }
}
