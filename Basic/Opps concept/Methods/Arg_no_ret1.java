
class A{
    void show1(int a){
        System.out.println(a);
    }
}
class B{
    void show2(int a){
        System.out.println(a);
    }
}
class C{
    void show3(int a){
        System.out.println(a);
    }
    void showb(int b){
        System.out.println(b);
    }
    void showc(int c){
        System.out.println(c);
    }
}
class D{
    void show4(int a){
        System.out.println(a);
    }
    void showb(int b){
        System.out.println(b);
    }
    void showc(int c){
        System.out.println(c);
    }
    void showd(int d){
        System.out.println(d);
    }
}
public class Arg_no_ret1 {
    public static void main(String[] args) {
        A p=new A();
        p.show1(5);

        B p2=new B();
        p2.show2(10);

        C p3=new C();
        p3.show3(15);
        p3.showb(2);
        p3.show3(3);

        D p4=new D();
        p4.show4(20);
        p4.showb(2);
        p4.showc(3);
        p4.showd(4);
    }
}
  