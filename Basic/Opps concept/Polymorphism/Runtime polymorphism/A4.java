class A{
    void show(){
        System.out.println("hello");
    }
}
class B extends A{
    int show(){
        int a=78;
        return a;
    }
}
public class A4 {
    public static void main(String[] args) {
        B p=new B();
        p.show();
    }   
}