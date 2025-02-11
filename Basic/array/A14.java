// 123,567,453,678 ,876

// every element reverse 
// 123 -->321 
// 567 --->765 
public class A14 {

    public static void main(String[] args) {
        int sum = 0, rev = 0;
        int arr[] = {123, 567, 453, 678, 876};

        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            while (temp != 0) {
                int remainder = temp % 10;
                temp /= 10;
                rev = rev * 10 + remainder;
            }

            arr[i] = rev;
            rev = 0;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
