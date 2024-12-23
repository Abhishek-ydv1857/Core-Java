import java.util.Scanner;

class A{
    int a;
    int b;
    void add(int a,int b){
        this.a=a;
        this.b=b;

        int ad=a+b;
        System.out.println(ad);
    }
    
}
class B{
    int c;
    int d;
    void sub(int c,int d){
        this.c=c;
        this.d=d;
        int sub=c-d;
        System.out.println(sub);
    }
}
class C{
    int e;
    int f;
    void multi(int e,int f){
        this.e=e;
        this.f=f;
        int multi=e*f;
        System.out.println(multi);
    }
}
class D{
    int g;
    int h;
    void div(int g,int h){
        this.g=g;
        this.h=h;
        int div=g/h;
        System.out.println(div);
    }
}
public class A4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a ");
        int a=sc.nextInt();
        System.out.println("Enter b");
        int b=sc.nextInt();
        A p1=new A();
        p1.add(a, b);

        System.out.println("Enter a ");
        int c=sc.nextInt();
        System.out.println("Enter b");
        int d=sc.nextInt();
        B p2=new B();
        p2.sub(c, d);

        System.out.println("Enter a ");
        int e=sc.nextInt();
        System.out.println("Enter b");
        int f=sc.nextInt();
        C p3=new C();
        p3.multi(e, f);

        System.out.println("Enter a ");
        int g=sc.nextInt();
        System.out.println("Enter b");
        int h=sc.nextInt();
        D p4=new D();
        p4.div(g, h);
    }
}
