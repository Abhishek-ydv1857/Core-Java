
import javax.sound.midi.Soundbank;

class A {
    int a=1;int b=2;
    int c=3;int d=4;
 
}
class B extends A{
    void show(){
        System.out.println(a);
        System.out.println(b);
    }
}
class C extends A{
    void show2(){
        System.out.println(c);
        System.out.println(d);
    }
}
class D extends A{
    void show3(){
        System.out.println(a);
    }
}

public class A18 {
    public static void main(String[] args) {
        B p=new B();
        p.show();
        C k=new C();
        k.show2();
        D l=new D();
        l.show3();
    }
}
