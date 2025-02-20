// user input :
// array :1,2,3,5,4 :maximum element find 

public class B11 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,6,677,665,4,4,333,3344,3,33,44444,4};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];

            }
        }
        System.out.println(max);

        
    }
}
