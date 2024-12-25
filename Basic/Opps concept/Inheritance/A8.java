class A{
    void m1(){
        System.out.println("Class A m1");
    }
    void m2(){
        m1();
    }
}
class B extends A{
    void m3(){
        System.out.println("Class B m3");
    }
    void m4(){
        m3();
    }
    void m5(){
        A p=new A();
        p.m2();
    }
}
public class A8 {
    public static void main(String[] args) {
        B p=new B();
        p.m1();
        p.m2();
        p.m3();
        p.m4();
        p.m5();
    }
}
