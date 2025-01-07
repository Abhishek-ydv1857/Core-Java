import java.util.Scanner;

class A {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    void method(){
        System.out.println("Enter a and b :");
    }
}
class B extends A{
    void method2(){
       
        super.method();
        int c=a+b;
        System.out.println(c);
    }
}
public class A12 {
    public static void main(String[] args) {
        B p=new B();
        p.method2();
    }
}
