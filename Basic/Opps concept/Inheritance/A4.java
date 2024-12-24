
import java.util.Scanner;

class A{
    A(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a :");
        int a=sc.nextInt();
        System.out.println("Enter b : ");
        int b=sc.nextInt();
        int multi = a*b;
        System.out.println("Multi : " +multi);
    }
}
class B extends A{
    B(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a :");
        int c=sc.nextInt();
        System.out.println("Enter b : ");
        int d=sc.nextInt(); 
        int div = c/d;
        System.out.println("Div : " +div);
    }
}
public class A4 {
    public static void main(String[] args) {
        B p=new B();
    }
}
