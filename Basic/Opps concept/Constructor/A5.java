import java.lang.classfile.Signature;
import java.util.Scanner;

class Add{
    int a;
    int b;
    Add(int a,int b){
        this.a=a;
        this.b=b;
        int add=a+b;
        System.out.println(add);
    }
}
class Sub{
    int c;
    int d;
    Sub(int c,int d){
        this.c=c;
        this.d=d;
        int sub=c-d;
        System.out.println(sub);
    }
}
class Multi{
    int e;
    int f;
    Multi(int e,int f){
        this.e=e;
        this.f=f;
        int multi=e*f;
        System.out.println(multi);
    }
}
class Div{
    int g;
    int h;
    Div(int g,int h){
        this.g=g;
        this.h=h;
        int div=g/h;
        System.out.println(div);
    }
}
public class A5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a");
        int a=sc.nextInt();
        System.out.println("Enter b");
        int b=sc.nextInt();
        new Add(a, b);

        System.out.println("Enter a");
        int c=sc.nextInt();
        System.out.println("Enter b");
        int d=sc.nextInt();
        new Sub(c,d);

        System.out.println("Enter a");
        int e=sc.nextInt();
        System.out.println("Enter b");
        int f=sc.nextInt();
        new Multi(e, f);

        System.out.println("Enter a");
        int g=sc.nextInt();
        System.out.println("Enter b");
        int h=sc.nextInt();
        new Div(g,h);

    }
}
