class A{
    A(){
        System.out.println("class A constructor");
    }
}
class B extends A{
    B(){
    System.out.println("class B constructor");
}
}
public class A3 {
    public static void main(String[] args) {
        B p=new B();
        
    }
}
