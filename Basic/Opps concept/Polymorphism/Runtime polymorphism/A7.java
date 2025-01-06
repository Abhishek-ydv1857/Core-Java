class A {
    void show(int a ,int b){
        int c=a+b;
        System.out.println(c);
    }
}
class B extends A{
    void show(){
        super.show(9, 4);
        System.out.println("B class");
    }
    }

public class A7 {
    public static void main(String[] args) {
        B p=new B();
        p.show();
    }
}
