import java.util.Scanner;
class A{
    void add(int a,int b){
        int cal = a+b;
        System.out.println(cal);
    }
    void sub(int c,int d){
        int cal=c-d;
        System.out.println(cal);
    }
    void div(int e,int f){
        int cal=e/f;
        System.out.println(cal);
    }
    void multi(int g,int h){
        int cal=g*h;
        System.out.println(cal);
    }
}

public class Arg_no_ret2 {
    public static void main(String[] args) {
        A p1=new A();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a :");
        int a=sc.nextInt();
        System.out.println("Enter b:");
        int b=sc.nextInt();
        p1.add(a, b);


        
        Scanner ab=new Scanner(System.in);
        System.out.println("Enter a :");
        int c=ab.nextInt();
        System.out.println("Enter b:");
        int d=ab.nextInt();
        p1.sub(c, d);

        
        Scanner sc3=new Scanner(System.in);
        System.out.println("Enter a :");
        int e=sc3.nextInt();
        System.out.println("Enter b:");
        int f=sc3.nextInt();
        p1.div(e, f);
        
        Scanner sc4=new Scanner(System.in);
        System.out.println("Enter a :");
        int g=sc4.nextInt();
        System.out.println("Enter b:");
        int h=sc4.nextInt();
        p1.multi(g, h);
        
    }
}
