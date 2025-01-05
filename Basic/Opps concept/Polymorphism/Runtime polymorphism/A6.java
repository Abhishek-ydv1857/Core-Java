
class A{
    void show(){
        System.out.println("A class ");
    }
}
class B extends A{
    void show(){
        super.show();
        System.out.println("B class");
    }
}
class C extends B{
    void show(){
        super.show();
        System.out.println("C class");
    }
}
public class A6 {
    public static void main(String[] args) {
        C p=new C();
        p.show();
    }
}
