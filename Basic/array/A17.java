// 123,8675,6434,7657,8766 

// every element k andr se even digit :
// 	123 :2 
// 	8675 :86 

public class A17 {
    public static void main(String[] args) {
        int[] numbers = {123, 8675, 6434, 7657, 8766};

        for (int num : numbers) {
            System.out.print(num + " : ");
            printEvenDigits(num);
            System.out.println();
        }
    }

    public static void printEvenDigits(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                System.out.print(digit);
            }
            num /= 10;
        }
    }
}
