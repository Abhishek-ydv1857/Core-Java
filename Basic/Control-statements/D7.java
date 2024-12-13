import java.util.Scanner;

public class D7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character for the operation: ");
        char operation = scanner.next().charAt(0);

        switch (operation) {
            case 'a':
                System.out.print("Enter a number to check if it's Armstrong: ");
                int armstrongNumber = scanner.nextInt();
                checkArmstrong(armstrongNumber);
                break;
            case 'p':
                System.out.print("Enter a number to check if it's Prime: ");
                int primeNumber = scanner.nextInt();
                checkPrime(primeNumber);
                break;
            case 'e':
                System.out.print("Enter a number to check if it's Even or Odd: ");
                int evenOddNumber = scanner.nextInt();
                checkEvenOdd(evenOddNumber);
                break;
            case 'o':
                System.out.print("Enter a number to check if it's Odd or Even: ");
                int oddNumber = scanner.nextInt();
                checkEvenOdd(oddNumber);
                break;
            case 'f':
                System.out.print("Enter a number to find its Factorial: ");
                int factorialNumber = scanner.nextInt();
                findFactorial(factorialNumber);
                break;
            case 'r':
                System.out.print("Enter a number to reverse it: ");
                int reverseNumber = scanner.nextInt();
                reverseNumber(reverseNumber);
                break;
            case 'l':
                System.out.print("Enter the number of Fibonacci terms: ");
                int fibonacciTerms = scanner.nextInt();
                fibonacciSeries(fibonacciTerms);
                break;
            case 't':
                System.out.print("Enter a number to check if it's a Perfect number: ");
                int perfectNumber = scanner.nextInt();
                checkPerfectNumber(perfectNumber);
                break;
            case 'n':
                System.out.print("Enter a number to check if it's a Neon number: ");
                int neonNumber = scanner.nextInt();
                checkNeonNumber(neonNumber);
                break;
            case 'w':
                System.out.print("Enter a year to check if it's a Leap Year: ");
                int year = scanner.nextInt();
                checkLeapYear(year);
                break;
            case 's':
                System.out.print("Enter two numbers to swap: ");
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();
                swapNumbers(num1, num2);
                break;
            case 'v':
                System.out.print("Enter a character to check if it's a Vowel or Consonant: ");
                char character = scanner.next().charAt(0);
                checkVowelOrConsonant(character);
                break;
            default:
                System.out.println("Invalid operation selected.");
        }

        scanner.close();
    }

    // Check Armstrong number
    public static void checkArmstrong(int number) {
        int sum = 0, temp, remainder, digits = 0;
        temp = number;
        while (temp != 0) {
            temp /= 10;
            digits++;
        }
        temp = number;
        while (temp != 0) {
            remainder = temp % 10;
            sum += Math.pow(remainder, digits);
            temp /= 10;
        }
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    // Check if Prime number
    public static void checkPrime(int number) {
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    // Check if Even or Odd
    public static void checkEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }
    }

    // Find Factorial
    public static void findFactorial(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + number + " is " + factorial);
    }

    // Reverse a number
    public static void reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        System.out.println("Reversed number is " + reversed);
    }

    // Generate Fibonacci series
    public static void fibonacciSeries(int terms) {
        int a = 0, b = 1, next;
        System.out.print("Fibonacci Series: " + a + " " + b);
        for (int i = 3; i <= terms; i++) {
            next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
        System.out.println();
    }

    // Check if Perfect number
    public static void checkPerfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == number) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }

    // Check if Neon number
    public static void checkNeonNumber(int number) {
        int square = number * number;
        int sum = 0;
        while (square != 0) {
            sum += square % 10;
            square /= 10;
        }
        if (sum == number) {
            System.out.println(number + " is a Neon number.");
        } else {
            System.out.println(number + " is not a Neon number.");
        }
    }

    // Check if Leap year
    public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }

    // Swap two numbers
    public static void swapNumbers(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
    }

    // Check if Vowel or Consonant
    public static void checkVowelOrConsonant(char character) {
        character = Character.toLowerCase(character);
        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
            System.out.println(character + " is a Vowel.");
        } else {
            System.out.println(character + " is a Consonant.");
        }
    }
}
