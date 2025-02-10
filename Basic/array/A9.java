// 12,67,46,435,607,385,33,335,34,23

// output:
// 607,435,46,67,12,23,34,335,33,385 
public class A9 {
    public static void main(String[] args) {
        int arr[]={12,67,46,435,607,385,33,335,34,23};
        int midarr=arr.length/2;
        for(int i=midarr-1;i>=0;i--){
            System.out.print(arr[i] +" ");
        }
        for(int i=arr.length-1;i>=midarr;i--){
            System.out.print(arr[i] +" ");
        }
    }
}
