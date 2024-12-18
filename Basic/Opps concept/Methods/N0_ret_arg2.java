class A{
    void print(){
        System.out.println("Hello World");
    }
    void print2(){
        System.out.println("2 Hello World");
    }
}
public class N0_ret_arg2 {
    public static void main(String[] args) {
        A p=new A();
        p.print();
        p.print2();
    }
}
