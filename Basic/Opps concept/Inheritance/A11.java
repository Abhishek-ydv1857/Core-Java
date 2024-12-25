class A{
    A(){
        System.out.println("A constructor");
    }
}
class B extends A {
    B(){
        System.out.println("B constructor");
    }
}
class C  extends B{
    C(){
        System.out.println("C constructor");
    }
}
class D extends C{
    D(){
        System.out.println("D constructor");
    }
}
public class A11 {
    public static void main(String[] args) {
        D p=new D();
    }
}
