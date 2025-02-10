public class A7 {
    public static void main(String[] args) {
        int[] numbers = {12, 67, 46, 435, 67, 385, 33, 335, 34, 23};
        int mid = numbers.length / 2;
        for(int i=0;i<mid;i++){
            System.out.print(numbers[i] +" ");
        }
        for(int i=numbers.length-1;i>=mid;i--){
            System.out.print(numbers[i]+" ");
        }
        
    }
}
