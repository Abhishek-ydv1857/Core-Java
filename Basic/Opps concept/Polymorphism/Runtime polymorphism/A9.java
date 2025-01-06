class A {
    A(int a){
        System.out.println(a);
    }
}
class B extends A{
    B(int b){
        super(34);
        System.out.println(b);
    }
}
class C extends B{
    C(int c){
        super(30);
        System.out.println(c);
    }
}
public class A9 {
    public static void main(String[] args) {
        new C(12);
    }
}
