// 1,2,3,4,5,6,7,8,9,10 array :

// first element swap with the last element  

public class B6{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};

        int temp =arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1]=temp;
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] +" ");

        }

    }
}