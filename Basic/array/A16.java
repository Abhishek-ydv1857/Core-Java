// 123,567,453,678 ,876

// every element k digit ka sum :123=>6 
// even number

public class A16 {
    public static void main(String[] args) {
        int[] numbers = {123, 567, 453, 678, 876};

        for (int num : numbers) {
            int sum = digitSum(num);
            if (sum % 2 == 0) {
                System.out.println(num + " => " + sum);
            }
        }
    }

    public static int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}

