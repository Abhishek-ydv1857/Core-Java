// 1,2,3,4,5,6,7,8,9,10 :

// output :
// 2,4,7,9
public class A11 {
    public static void main(String []args){
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int midarr=arr.length/2;
        for(int i=1;i<=midarr-1;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i] +" ");
            }
        }
            for(int i=midarr;i<=arr.length-1;i++){
                if(arr[i]%2!=0){
                    System.out.print(arr[i] +" ");
                }
            }
        
    }
}
