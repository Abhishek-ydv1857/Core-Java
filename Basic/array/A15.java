// array :
// palindrome 

// Armstrong find 

// neon find 
public class A15 {
    public static void main(String[] args) {
        int[] numbers = {121, 153, 9, 370, 123, 45};

        for (int num : numbers) {
            if (isPalindrome(num)) {
                System.out.println(num + " is a Palindrome");
            }
            if (isArmstrong(num)) {
                System.out.println(num + " is an Armstrong Number");
            }
            if (isNeon(num)) {
                System.out.println(num + " is a Neon Number");
            }
        }
    }

    public static boolean isPalindrome(int num) {
        int original = num, reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return original == reversed;
    }

    public static boolean isArmstrong(int num) {
        int original = num, sum = 0, digits = (int) Math.log10(num) + 1;
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        return sum == original;
    }

    public static boolean isNeon(int num) {
        int square = num * num, sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }
}
