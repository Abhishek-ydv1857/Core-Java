class A{
    void show(int a){
        System.out.println(a);
    }
}
class B{
    void show(int b){
        System.out.println(b);
    }
    void a(int c){
        System.out.println(c);
    }
}
class C{
    void show(int a){
        System.out.println(a);
    }
    void b(int a){
        System.out.println(a);
    }
    void c(int a){
        System.out.println(a);
    }
}
class D{
    void show(int a){
        System.out.println(a);
    }
    void a(int a){
        System.out.println(a);
    }
    void b(int a){
        System.out.println(a);
    }
    void c(int a){
        System.out.println(a);
    }
}
public class Ret_arg1{
    public static void main(String[] args) {
        A p = new A();
        p.show(5);

        B q = new B();
        q.show(5);
        q.show(7);

        C r = new C();
        r.show(5);
        r.show(45);
        r.show(55);

        D s = new D();
        s.show(5);
        s.show(556);
        s.show(523);
        s.show(523);
        
    }
}
