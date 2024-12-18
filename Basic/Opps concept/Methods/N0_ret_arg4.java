
import java.util.Scanner;

class A{
    void add(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a and b : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c = a+b;
        System.out.println(c);
    }
}
class B{
    void sub(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a and b : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c = a-b;
        System.out.println(c);
    }
}
class C{
    void div(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a and b : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c = a/b;
        System.out.println(c);
    }
}
class D{
    void multi(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a and b : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c = a*b;
        System.out.println(c);
    }
}
public class N0_ret_arg4 {
    public static void main(String[] args) {
        A p=new A();
        p.add();
        B p2=new B();
        p2.sub();
        C p3=new C();
        p3.div();
        D p4=new D();
        p4.multi();
    }
}
