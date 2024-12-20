class A{
    A show(String s){
        System.out.println(s);
        return this;
    }
}
public class Ret_arg3 {
    public static void main(String[] args) {
        A p = new A();
        p.show("Welcome to India");
    }
}