class A{
    void show(){
        System.out.println("A class");
    }
}
class B extends A{
    void show(){
        super.show();
        System.out.println("B class");
    }
}
public class A2 {
    public static void main(String[] args) {
        B p=new B();
        p.show();
    } 
}
