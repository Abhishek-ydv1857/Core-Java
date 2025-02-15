public class B5 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 4, 5};
        int[] sum = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            sum[i] = a[i] + b[i];
        }

        System.out.print("Sum of two arrays: ");
        for (int num : sum) {
            System.out.print(num + " ");
        }
    }
}
