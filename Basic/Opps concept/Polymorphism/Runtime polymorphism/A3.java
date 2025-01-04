class A{
    void show(int a){
        System.out.println("A class is " +a);
    }
}
class B extends A{
    void show(int a){
        super.show(58);
        System.out.println("B class is " +a);
    }
}
public class A3 {
    public static void main(String[] args) {
        B p=new B();
        p.show(29);
    }
}
