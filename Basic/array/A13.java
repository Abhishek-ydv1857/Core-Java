// ----------------------------------------------------------------------
// 1,2,3,4,5,6,7,8,9,10 :

// every element table print
public class A13{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<arr.length;i++){
              for(int j=1;j<=10;j++){
                System.out.print((arr[i]*j) +" " );
              }  
              System.out.println(); 
        }
    }
}
