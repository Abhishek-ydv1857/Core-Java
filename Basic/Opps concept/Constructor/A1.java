import java.util.*;
class A {
    A(int a,int b){
        int sum=a+b;
        System.out.println("Sum is : " +sum);
    }
}
class B{
    B(int c,int d){
        int sub=c-d;
        System.out.println("Sub is : "+sub);
    }
}
class C{
    C(int e,int f){
        int multi=e*f;
        System.out.println("Multi is : "+multi);
    }
}
class D{
    D(int g,int h){
        int div=g/h;
        System.out.println("Div is : " +div);
    }
}
public class A1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a :");
        int a=sc.nextInt();
        System.out.println("Enter b :");
        int b=sc.nextInt();
        new A(a,b);

        System.out.println("Enter c :");
        int c=sc.nextInt();
        System.out.println("Enter d :");
        int d=sc.nextInt();
        new B(c,d);

        System.out.println("Enter e ");
        int e=sc.nextInt();
        System.out.println("Enter f :");
        int f=sc.nextInt();
        new C(e, f);

        System.out.println("Enter g :");
        int g=sc.nextInt();
        System.out.println("Enter h :");
        int h=sc.nextInt();
        new D(g,h);
    }
}