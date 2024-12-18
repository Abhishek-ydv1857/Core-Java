class A {
    void show1(){
        System.out.println("Show A class");
    }
}
class B {
    void show2(){
        System.out.println("Show B class");
    }
}
class C {
    void show3(){
        System.out.println("Show C class");
    }
}
class D {
    void show4(){
        System.out.println("Show D class");
    }
}

public class N0_ret_arg3 {
   public static void main(String[] args) {
     A p=new A();
     p.show1();
     B p1=new B();
     p1.show2();
     C p2=new C();
     p2.show3();
     D p3=new D();
     p3.show4();
   }     
}
