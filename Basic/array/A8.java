// 607,435,46,67,12,385,33,335,34,23

public class A8 {
    public static void main(String []args){
        int arr[]={12,67,46,435,607,385,33,335,34,23};
        int midarr = arr.length/2;
        for(int i=midarr-1;i>=0;i--){
            System.out.print(arr[i] +" ");
        }
        for(int i=midarr;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
