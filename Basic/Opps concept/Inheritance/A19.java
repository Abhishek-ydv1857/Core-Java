class A {
    void m1(){
       System.out.println("m1 class A");
    }
    void m2(){
        this.m1();
    }
    void m3(){
        this.m2();
    }

}
class B extends A{
    void m4(){
        System.out.println("m4 Class B");
    }
    void m5(){
        this.m4();
    }
    void m6(){
        this.m5();
    }
}
class C extends A{
    void m7(){
        System.out.println("m7 class C");
    }
    void m8(){
        this.m7();
    }
}
class D extends A {
    void m9(){
        System.err.println("m9 Class D");
    }
    void m10(){
        this.m9();
    }
}
public class A19 {
    public static void main(String[] args) {
        B p1=new B();
        p1.m3();
        p1.m6();
        C p2=new C();
        p2.m3();
        p2.m8();
        D p3=new D();
        p3.m1();
        p3.m10();
    }
}
