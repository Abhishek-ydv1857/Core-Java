class A {
    A(int a){
        System.out.println(a);
    }
}
class B extends A{
    B(int b){
        super(12);
        System.out.println(b);
    }
}
class C extends A{
    C(int c){
        super(12);
        System.out.println(c);
    }
}
public class A10 {
    public static void main(String[] args) {
        new B(48);
        new C(47);
    }
}
