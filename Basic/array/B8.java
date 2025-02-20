// a[]=1,2,3,4,5
// b[]=1,2,3,4,5
// sum two array 

public class B8 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={1,5,6,4,10};
        
        for(int i=0;i<a.length;i++){
            a[i]=a[i]+b[i];
            System.out.print(a[i] + " ");
        }
        
    }

}
