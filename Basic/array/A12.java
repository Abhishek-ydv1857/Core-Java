import java.util.Scanner;

public class A12 {
    public static void main(String []args ){
        Scanner sc=new Scanner(System.in);
        int f= sc.nextInt();
        int a[]={1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=f && a[i]!=10)
            {
                System.out.print(a[i]+" ");
            }
        }
    }
}
