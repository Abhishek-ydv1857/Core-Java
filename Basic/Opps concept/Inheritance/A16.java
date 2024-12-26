class A {
    A(){
        int num1=2; int num2=3;
        int sum=num1+num2;
        System.out.println(sum);
    }
}
class B extends A {
    B(){
        System.out.println("Class B");
    }
}
class C extends A{
    C(){
        System.out.println("Class C");
    }
}
class D extends A{
    D(){
        System.out.println("Class D");
    }
}
public class A16 {
    public static void main(String[] args) {
        new B();
        new C();
        new D();

    }
}
