class A{
    void method1(){
        System.out.println("Class A");
    }
}
class B extends A{
        void method2(){
            System.out.println("Class B");
        }
}
class C extends B{
        void method3(){
            System.out.println("Class C");
        }
        void obj1(){
            A p=new A();
            p.method1();
        }
    
        void method5(){
            System.out.println("method5");
        }
}

class D extends C{
        void method4(){
            System.out.println("Class D");
        }
        void obj2(){
        B p=new B();
        p.method2();
}
}

public class A6 {
    public static void main(String[] args) {
        D p=new D();
        p.method1();
        p.method2();
        p.method3();
        p.obj1();
        p.method5();
        p.method4();
        p.obj2();
    }
}
