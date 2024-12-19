class A{
    String a(){
        String name = "Abhishek";
        return name;
    }
}
public class Ret_no_arg2 {
    public static void main(String[] args) {
        A p = new A();
        System.out.println(p.a());
    }
}
