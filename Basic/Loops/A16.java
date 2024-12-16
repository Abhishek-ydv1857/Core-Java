public class A16 {
    public static void main(String[] args) {
        // Type 1: Tables from 2 to 10
        int i = 2;

        while (i <= 10) {
            int j = 1;
            System.out.println("Table of " + i + ":");

            while (j <= 10) {
                System.out.println(i + " x " + j + " = " + (i * j));
                j++;
            }

            System.out.println();
            i++;
        }

        // Type 2: Tables from 5 to 9
        int start = 5;
        int end = 9;
        int a = start;

        while (a <= end) {
            int b = 1;
            System.out.println("Table of " + a + ":");

            while (b <= 10) {
                System.out.println(a + " x " + b + " = " + (a * b));
                b++;
            }

            System.out.println();
            a++;
        }
    }
}
